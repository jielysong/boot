package com.jiely.controller;

import com.jiely.entity.Customer;
import com.jiely.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 *
 * Created by Administrator on 2017/2/17.
 */
@RequestMapping("/customer")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/save")
    public Iterable<Customer> save(){
        Customer customer = new Customer();
        customer.setPassword("111111");
        customer.setCreateDate(new Date());
        customer.setBalance(120.22);
        customer.setCustomerName("江海1");
        customer.setHeadImgUrl("http://hello/image.jpg");
        customer.setEmailAddress("jianghai@163.com");
        customer.setScreenName("少帅1");
        customerService.add(customer);
        return customerService.findAll();
    }

    @RequestMapping("/find")
    public Customer findOne(Long id){
        return customerService.find(id);
    }
}
