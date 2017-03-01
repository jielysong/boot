package com.jiely.service;

import com.jiely.entity.Customer;
import com.jiely.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by Administrator on 2017/2/17.
 */
@Service
public class CustomerService {

    @Resource
    private CustomerRepository customerRepository;

    @Transactional
    public void add(Customer customer){
        customerRepository.save(customer);
    }

    @Transactional
    public void delete(Customer customer){
        customerRepository.delete(customer);
    }

    public Customer find(long id){
        return customerRepository.findOne(id);
    }

    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }
}
