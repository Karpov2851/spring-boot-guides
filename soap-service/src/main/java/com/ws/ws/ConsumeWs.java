package com.ws.ws;

import com.ws.service.RehireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vikas on 07-05-2019.
 */
@RestController
public class ConsumeWs {

    @Autowired
    private RehireService rehireService;

    @GetMapping("/wsrehire")
    public void fetchRehireDetails(){
        rehireService.callRehireWs();
    }
}
