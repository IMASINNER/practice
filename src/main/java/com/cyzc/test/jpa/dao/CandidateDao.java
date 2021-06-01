package com.cyzc.test.jpa.dao;

import com.cyzc.test.distanceTest.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-04-03
 */
@Repository
public interface CandidateDao extends JpaSpecificationExecutor<Candidate>,
        JpaRepository<Candidate, Integer> {

}
