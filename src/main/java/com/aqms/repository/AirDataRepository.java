package com.aqms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aqms.model.AirData;


@Repository
public interface AirDataRepository extends CrudRepository<AirData, Integer>{

}
