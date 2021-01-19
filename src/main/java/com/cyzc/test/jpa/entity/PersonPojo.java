package com.cyzc.test.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author: Cyzc
 * @Date: 2020/8/31
 * @Description:
 */
@Entity
@Getter
@Setter
public class PersonPojo {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int age;


}
