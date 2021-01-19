package com.cyzc.test.Entity;

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
