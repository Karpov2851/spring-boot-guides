package com.ws.config.ws;

import com.ws.config.model.QuartzCreateVO;
import com.ws.config.util.QuartzInitializer;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vikas on 02-07-2019.
 */
@RestController
public class SchedulerController {

    @Autowired
    private Scheduler scheduler;

    @GetMapping("/schedule/{qiden}/{qdesc}/{qtrigger}/{qtriggerdesc}")
    public ResponseEntity<String> schedule(@PathVariable String qiden,
                                           @PathVariable String qdesc,
                                           @PathVariable String qtrigger,
                                           @PathVariable String qtriggerdesc, HttpServletRequest request){

        try{
            Map<String, String> pathVariables = (Map<String, String>) request
                    .getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
        }catch(Exception e){
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<String>(HttpStatus.OK.getReasonPhrase(),HttpStatus.OK);
    }


}
