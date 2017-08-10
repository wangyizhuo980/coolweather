package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wangyizhuo on 2017/8/10.
 */

public class Province extends DataSupport {
    private int id;
    private int provinceId;
    private String provinceCode;

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
