package com.jiely.service;

import com.jiely.entity.Cat;
import com.jiely.repository.Cat2Repository;
import com.jiely.repository.CatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 *
 * Created by Administrator on 2017/2/14.
 */
@Service
public class CatService {

    @Resource
    private CatRepository catRepository;

    @Resource
    private Cat2Repository cat2Repository;

    //保存数据.
    @Transactional
    public void save(Cat cat){
        catRepository.save(cat);
    }

    //删除数据》
    @Transactional
    public void delete(int id){
        catRepository.delete(id);
    }

    //查询数据.
    public Iterable<Cat> getAll(){
        return catRepository.findAll();
    }

    //按名字查询
    public Cat getCatByName(String name){
        return cat2Repository.findByCatName(name);
    }

    //按名字查询
    public Cat getCatMyName(String name){
        return cat2Repository.findMyCatName(name);
    }

}
