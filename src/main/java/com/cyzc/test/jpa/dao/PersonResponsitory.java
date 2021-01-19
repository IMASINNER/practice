package com.cyzc.test.jpa.dao;

import com.cyzc.test.jpa.entity.PersonPojo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Cyzc
 * @Date: 2020/8/31
 * @Description:
 */
public interface PersonResponsitory extends JpaRepository<PersonPojo, Long> {

}
