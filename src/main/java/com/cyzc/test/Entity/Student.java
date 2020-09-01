package com.cyzc.test.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Cyzc
 * @Date: 2020/9/1
 * @Description:
 */

public class Student {

    private Long id;
    private String Sname;
    private int Ssex;
    private int Sclass;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public int getSsex() {
        return Ssex;
    }

    public void setSsex(int ssex) {
        Ssex = ssex;
    }

    public int getSclass() {
        return Sclass;
    }

    public void setSclass(int sclass) {
        Sclass = sclass;
    }
}
