package com.ws.config.util;

import com.ws.config.model.QuartzCreateVO;
import com.ws.config.scheduler.QuartzJob;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * Created by vikas on 02-07-2019.
 */
public class QuartzInitializer {
    public static Logger logger = LoggerFactory.getLogger(QuartzInitializer.class);


    public static QuartzCreateVO generateQuartzVO(Map<String,Object> quartzConfig, String intervalReminderConfig,
                                                  String quartzIdentity, String quartzDesc, String triggerName, String triggerDesc){
        QuartzCreateVO qVo = null;
        String [] arrConfig = intervalReminderConfig.split("@");
        if(arrConfig!=null && arrConfig.length > 0){
            int reminderValue = Integer.parseInt(arrConfig[0]);
            int repeatCount = Integer.parseInt(arrConfig[1]);
            Date triggerDateTime = DateUtil.addTimeUnitToDate(new Date(),reminderValue, "MIN");
            JobDataMap jobDataMap = new JobDataMap(quartzConfig);
            qVo = new QuartzCreateVO(QuartzJob.class, jobDataMap,
                    quartzIdentity,quartzDesc,
                    DateUtil.convertUtilDateToString(triggerDateTime,DateUtil.DATE_FORMAT_DD_MM_YYYY_HH_MM_SS),
                    triggerName,
                    triggerDesc,repeatCount,reminderValue);
        }

        return qVo;
    }

    public static void generateQuartzSchedule(Scheduler scheduler, QuartzCreateVO createVO) throws Exception{
        logger.info("generateQuartzSchedule with details "+createVO.toString());
        Date d = DateUtil.convertStringToDate(createVO.getDateString(),DateUtil.DATE_FORMAT_DD_MM_YYYY_HH_MM_SS);
        JobDetail jobDetail = JobBuilder.newJob(createVO.getT())
                .withIdentity(UUID.randomUUID().toString(), createVO.getQrtzIdent())
                .withDescription(createVO.getQrtzDesc())
                .usingJobData(createVO.getJobDataMap())
                .storeDurably()
                .build();
        Trigger trigger = null;
        if(createVO.getRepeatCount()!=null){
            trigger = TriggerBuilder.newTrigger()
                    .forJob(jobDetail)
                    .withIdentity(jobDetail.getKey().getName(), createVO.getTriggerName())
                    .withDescription(createVO.getTriggDesc())
                    .startAt(DateBuilder.futureDate(createVO.getInterval(), DateBuilder.IntervalUnit.MINUTE))
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule().withRepeatCount(createVO.getRepeatCount()).withIntervalInMinutes(createVO.getInterval()))
                    .build();
        }else{
            trigger = TriggerBuilder.newTrigger()
                    .forJob(jobDetail)
                    .withIdentity(jobDetail.getKey().getName(), createVO.getTriggerName())
                    .withDescription(createVO.getTriggDesc())
                    .startAt(d)
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule().repeatForever().withIntervalInMinutes(createVO.getInterval()))
                    .build();
        }

        scheduler.scheduleJob(jobDetail, trigger);
    }
}
