package com.cyzc.test.distanceTest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyLocation {

    private String name;
    private Double longitude;
    private Double latitude;
}
