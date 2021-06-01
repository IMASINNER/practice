package com.cyzc.test.model;

import lombok.Data;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-05-10
 */
@Data
public class UserBase {

    private Integer id;

    private String userName;

    private Integer userSex;

    private String userEmail;

    private String userPhone;

    private String userAddress;

}