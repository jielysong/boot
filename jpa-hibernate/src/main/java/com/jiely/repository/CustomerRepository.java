package com.jiely.repository;

import com.jiely.entity.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * Created by Administrator on 2017/2/17.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
