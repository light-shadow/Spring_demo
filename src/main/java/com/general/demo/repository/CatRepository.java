package com.general.demo.repository;

import com.general.demo.bean.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by general on 2017/8/14.
 */
public interface CatRepository extends CrudRepository<Cat, Integer> {

}
