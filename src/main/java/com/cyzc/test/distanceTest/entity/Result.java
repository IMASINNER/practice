package com.cyzc.test.distanceTest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-03-21
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    @Id
    private String id;

    private String date;

    private String confName;

    private String companyName;

    private String province;

    private Double distance;

    private Double companyLongitude;

    private Double companyLatitude;

    private Double confLongitude;

    private Double confLatitude;

    private String registerAddress;

}