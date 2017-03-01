package com.jiely.repository;

import com.jiely.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * Created by Administrator on 2017/2/17.
 */
public interface UserRepository extends CrudRepository<User,Long> {
}
