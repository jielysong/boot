package com.jiely.repository;

import com.jiely.entity.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * Created by Administrator on 2017/2/13 0013.
 */
public interface CatRepository extends CrudRepository<Cat, Integer> {
}
