package com.demo.db.demo_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.db.demo_db.entity.Company;

//IMPORT RELATIONS

@Service
public class CompanyBaseService {

	
	@Autowired
	private Datastore datastore;


    //CRUD METHODS
    

    

    
    /*
     * CUSTOM SERVICES
     * 
     *	These services will be overwritten and implemented in companyService.java
     */
    


}
