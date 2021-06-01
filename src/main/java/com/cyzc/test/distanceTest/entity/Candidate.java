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
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {

    @Id
    private Integer id;

    private String nameCh;

    private String address;

    private Double longitude;

    private Double latitude;
}