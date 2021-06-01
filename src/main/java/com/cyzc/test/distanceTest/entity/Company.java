package com.cyzc.test.distanceTest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-04-03
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    @Id
    private String id;

    private String stockCode;

    private String address;

    private String date;

    private Double longitude;

    private Double latitude;

}