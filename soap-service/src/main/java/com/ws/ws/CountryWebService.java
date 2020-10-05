package com.ws.ws;

import com.ws.model.CountryMstr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import com.ws.service.CountryService;

/**
 * Created by vikas on 07-04-2019.
 */
@RestController
public class CountryWebService {
    private static final Logger logger = LoggerFactory.getLogger(CountryWebService.class);

    @Autowired
    private CountryService countryService;

    @PostMapping(value = "/save")
    public ResponseEntity<?> userDetails(@RequestBody CountryMstr countryMstr) {
        try{
            int recordId = countryService.saveCountry(countryMstr,true);
            return new ResponseEntity<>("SUCCESS:"+recordId, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>("ERROR", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value="/fetch/{id}")
    public ResponseEntity<?> fetch(@PathVariable int id) {
        try{
            CountryMstr c = countryService.fetchCountry(id);
            return new ResponseEntity<>("SUCCESS:"+c.toString(), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>("ERROR", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
