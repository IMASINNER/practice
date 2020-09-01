package com.cyzc.test.config;

import com.cyzc.test.Entity.jpa.PersonPojo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Cyzc
 * @Date: 2020/8/31
 * @Description:
 */
public interface PersonResponsitory extends JpaRepository<PersonPojo,Long> {
}
