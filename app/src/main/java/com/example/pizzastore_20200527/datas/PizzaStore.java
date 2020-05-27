package com.example.pizzastore_20200527.datas;

import java.io.Serializable;

public class PizzaStore implements Serializable {
    private String name;
    private String phoneNum;
    private String logoImgUrl;

    public PizzaStore(String name, String phoneNum, String logoImgUrl) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.logoImgUrl = logoImgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getLogoImgUrl() {
        return logoImgUrl;
    }

    public void setLogoImgUrl(String logoImgUrl) {
        this.logoImgUrl = logoImgUrl;
    }
}
