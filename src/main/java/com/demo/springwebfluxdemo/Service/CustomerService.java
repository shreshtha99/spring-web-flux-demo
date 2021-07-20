package com.demo.springwebfluxdemo.Service;

import com.demo.springwebfluxdemo.dao.CustomerDao;
import com.demo.springwebfluxdemo.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao dao;
    public List<Customer> loadAllCustomers(){
        long start =System.currentTimeMillis();
        List<Customer> customers=dao.getCustomers();
        long end =System.currentTimeMillis();
        return customers;
    }
}
