package com.demo.springwebfluxdemo.dao;

import com.demo.springwebfluxdemo.dto.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



@Component
public class CustomerDao {

    private String name;
    private int i;
    private Object collect;

    public List<Customer> getCustomers(){
       return (List<Customer>) IntStream.range(1,5).mapToObj(i-> new Customer(i,"Customer"));

    }

    private void collect(Collector<Object,?, List<Object>> toList) {
    }


}
