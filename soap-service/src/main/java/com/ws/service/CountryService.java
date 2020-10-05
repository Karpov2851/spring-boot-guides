package com.ws.service;

import com.ws.model.CountryMstr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ws.repository.CountryRepository;

/**
 * Created by vikas on 08-04-2019.
 */
@Service
public class CountryService {
    private static final Logger logger = LoggerFactory.getLogger(CountryService.class);

    @Autowired
    private CountryRepository countryRepository;

    public CountryMstr fetchCountry(int id) throws Exception{
        CountryMstr c = null;
        try{
            c = countryRepository.findOne(id);
        }catch(Exception e){
            logger.error("Error in fetchCountry",e);
            throw e;
        }
        return c;
    }

    public CountryMstr findByName(String name) throws Exception{
        CountryMstr c = null;
        try{
            c = countryRepository.findByname(name);
        }catch(Exception e){
            logger.error("Error in findByName",e);
            throw e;
        }
        return c;
    }

    public int saveCountry(CountryMstr countryMstr,boolean isInsert) throws Exception{
        int recordId = 0;
        try{
            if(isInsert){
                recordId = countryRepository.saveAndFlush(countryMstr).getId();
            }else{
                CountryMstr existingCountry = countryRepository.findOne(countryMstr.getId());
                existingCountry.setCapital(countryMstr.getCapital());
                existingCountry.setCurrency(countryMstr.getCurrency());
                existingCountry.setName(countryMstr.getName());
                existingCountry.setPopulation(countryMstr.getPopulation());
                recordId = countryRepository.save(existingCountry).getId();
            }
        }catch(Exception e){
            logger.error("Error in saveCountry",e);
            throw e;
        }
        return recordId;
    }


}
