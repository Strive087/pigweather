package com.example.a84045.pigweather.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {

    private int id;

    private String provinveName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinveName() {
        return provinveName;
    }

    public void setProvinveName(String provinveName) {
        this.provinveName = provinveName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
