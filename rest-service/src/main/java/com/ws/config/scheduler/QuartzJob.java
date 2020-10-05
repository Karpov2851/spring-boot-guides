package com.ws.config.scheduler;

import com.ws.config.util.QuartzInitializer;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by vikas on 02-07-2019.
 */
public class QuartzJob implements Job{
    public Logger logger = LoggerFactory.getLogger(QuartzInitializer.class);
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDataMap jMap = jobExecutionContext.getMergedJobDataMap();
        logger.info("started" + String.valueOf(jMap.get("key1")));

    }
}
