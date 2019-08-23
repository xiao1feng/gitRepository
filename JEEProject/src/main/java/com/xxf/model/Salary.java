package com.xxf.model;

import java.util.Date;

public class Salary {
    private Integer s_id;
    private Integer e_id;
    private Date s_date;
    private Double s_performance;
    private Double s_extra;
    private Double s_s_insurance;
    private Double s_total;
    private Integer s_is_trouble;

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public Date getS_date() {
        return s_date;
    }

    public void setS_date(Date s_date) {
        this.s_date = s_date;
    }

    public Double getS_performance() {
        return s_performance;
    }

    public void setS_performance(Double s_performance) {
        this.s_performance = s_performance;
    }

    public Double getS_extra() {
        return s_extra;
    }

    public void setS_extra(Double s_extra) {
        this.s_extra = s_extra;
    }

    public Double getS_s_insurance() {
        return s_s_insurance;
    }

    public void setS_s_insurance(Double s_s_insurance) {
        this.s_s_insurance = s_s_insurance;
    }

    public Double getS_total() {
        return s_total;
    }

    public void setS_total(Double s_total) {
        this.s_total = s_total;
    }

    public Integer getS_is_trouble() {
        return s_is_trouble;
    }

    public void setS_is_trouble(Integer s_is_trouble) {
        this.s_is_trouble = s_is_trouble;
    }


    @Override
    public String toString() {
        return "Salary{" +
                "s_id=" + s_id +
                ", e_id=" + e_id +
                ", s_date=" + s_date +
                ", s_performance=" + s_performance +
                ", s_extra=" + s_extra +
                ", s_s_insurance=" + s_s_insurance +
                ", s_total=" + s_total +
                ", s_is_trouble=" + s_is_trouble +
                '}';
    }
}
