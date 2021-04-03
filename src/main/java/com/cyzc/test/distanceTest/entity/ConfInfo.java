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
public class ConfInfo {

    @Id
    @GeneratedValue
    private String id;

    private String batch;

    private String name;

    private String dynasty;

    private String type;

    private String province;

    private String address;

    private String addressDetail;

    private String addressType;

    private Double confLongitude;

    private Double confLatitude;
}