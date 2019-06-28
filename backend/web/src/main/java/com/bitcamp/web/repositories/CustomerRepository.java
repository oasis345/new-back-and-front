package com.bitcamp.web.repositories;

import com.bitcamp.web.entityes.Customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {  



    
}
