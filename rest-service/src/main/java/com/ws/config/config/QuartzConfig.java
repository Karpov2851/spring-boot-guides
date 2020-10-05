package com.ws.config.config;

import com.ws.config.util.QuartzInitializer;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by vikas on 02-07-2019.
 */
@Configuration
public class QuartzConfig {

    public  Logger logger = LoggerFactory.getLogger(QuartzInitializer.class);



    @Bean
    public Scheduler scheduler() {
        StdSchedulerFactory factory = new StdSchedulerFactory();
        try{
            factory.initialize(new ClassPathResource("quartz.properties").getInputStream());
            Scheduler scheduler = factory.getScheduler();
            scheduler.start();
            return scheduler;

        }catch(Exception e){
            logger.error("Error in initilizing scheduler bean ",e);
        }
            return null;
    }
}
