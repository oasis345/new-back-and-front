package com.bitcamp.web.service;

import java.util.List;


import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.repositories.CustomerRepository;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired CustomerRepository customerRepository;

 
    public void addCustomer(CustomerDTO customer) {
        
    }


    public List<CustomerDTO> findCustomers() {
        return null;
    }

  
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option) {
        return null;
    }

   
    public CustomerDTO findCustomerByCustomerId(String customerId) {
        return null;
    }

 
    public int updateCustomer(CustomerDTO customer) {
        int res = 0;
        if(res == 1){
            System.out.println("서비스 수정성공");
        }else{
            System.out.println("서비스 수정실패");
        }
        return res;
    }


    public void deleteCustomer(CustomerDTO customer) {
        
    }

 
    public Long countAll() {
        return customerRepository.count();
    }

 
    public CustomerDTO login(CustomerDTO customer) {
        System.out.println("컨트롤러에서 넘어온 ID: "+customer.getCustomerId());
        System.out.println("컨트롤러에서 넘어온 PASS: "+customer.getPassword());
        return null;
    }
    
}