package com.ws.repository;

import com.ws.model.CountryMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vikas on 08-04-2019.
 */
@Repository
public interface CountryRepository extends JpaRepository<CountryMstr,Integer>{

    CountryMstr findByname(String name);
}
