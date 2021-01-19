package com.cyzc.test.mybatis.entity;

/**
 * @author: Cyzc
 * @Date: 2020/9/1
 * @Description:
 */

public class Student {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsSex() {
        return sSex;
    }

    public void setsSex(int sSex) {
        this.sSex = sSex;
    }

    public int getsClass() {
        return sClass;
    }

    public void setsClass(int sClass) {
        this.sClass = sClass;
    }

    private String sName;
    private int sSex;
    private int sClass;


}
