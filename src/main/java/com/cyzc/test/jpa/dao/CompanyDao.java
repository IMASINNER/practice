package com.cyzc.test.jpa.dao;

import com.cyzc.test.distanceTest.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-04-03
 */
@Repository
public interface CompanyDao extends JpaRepository<Company,Integer>,
        JpaSpecificationExecutor<Company> {

}
