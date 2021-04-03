package com.cyzc.test.jpa.dao;

import com.cyzc.test.distanceTest.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-03-21
 */
@Repository
public interface ResultDao extends JpaRepository<Result, String>, JpaSpecificationExecutor<Result> {

}
