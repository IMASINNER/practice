package com.cyzc.test.distanceTest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
public class CompanyInfo {
    @Id
    @GeneratedValue
    private String id;

    private String companyId;

    private String symbol;

    private String name;

    private String date;

    private String industry;

    private String industryCode;

    private String registerAddress;

    private String longitude;

    private String latitude;

    private Double companyLongitude;

    private Double companyLatitude;

}