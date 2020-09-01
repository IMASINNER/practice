package com.cyzc.test.Entity.jpa;

import lombok.*;

import javax.persistence.Column;
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

    @Column(name = "name",nullable = true,length = 20)
    private String name;

    @Column(name = "age",nullable = true,length = 20)
    private int age;


}
