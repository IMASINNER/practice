package com.cyzc.test.jpa.dao;

import com.cyzc.test.distanceTest.entity.ConfInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-03-21
 */
@Repository
public interface ConfInfoDao extends JpaRepository<ConfInfo,String>, JpaSpecificationExecutor<ConfInfo> {



}
