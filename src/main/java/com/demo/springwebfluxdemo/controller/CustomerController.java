package com.demo.springwebfluxdemo.controller;

import com.demo.springwebfluxdemo.Service.CustomerService;
import com.demo.springwebfluxdemo.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;
    @GetMapping("/")
    public List<Customer> getAllCustomers(){
        return service.loadAllCustomers();

    }
}
