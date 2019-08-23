package com.xxf.model;

import java.util.Date;

public class Recruit {
    private Integer rct_id;
    private Integer pos_id;
    private String rct_title;
    private String rct_introduaction;
    private Date rct_publish_time;
    private String rct_address;
    private Double rct_salary;
    private Integer e_id;
    private Integer rct_is_draft;
    private Integer rct_is_publish;

    public Integer getRct_id() {
        return rct_id;
    }

    public void setRct_id(Integer rct_id) {
        this.rct_id = rct_id;
    }

    public Integer getPos_id() {
        return pos_id;
    }

    public void setPos_id(Integer pos_id) {
        this.pos_id = pos_id;
    }

    public String getRct_title() {
        return rct_title;
    }

    public void setRct_title(String rct_title) {
        this.rct_title = rct_title;
    }

    public String getRct_introduaction() {
        return rct_introduaction;
    }

    public void setRct_introduaction(String rct_introduaction) {
        this.rct_introduaction = rct_introduaction;
    }

    public Date getRct_publish_time() {
        return rct_publish_time;
    }

    public void setRct_publish_time(Date rct_publish_time) {
        this.rct_publish_time = rct_publish_time;
    }

    public String getRct_address() {
        return rct_address;
    }

    public void setRct_address(String rct_address) {
        this.rct_address = rct_address;
    }

    public Double getRct_salary() {
        return rct_salary;
    }

    public void setRct_salary(Double rct_salary) {
        this.rct_salary = rct_salary;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public Integer getRct_is_draft() {
        return rct_is_draft;
    }

    public void setRct_is_draft(Integer rct_is_draft) {
        this.rct_is_draft = rct_is_draft;
    }

    public Integer getRct_is_publish() {
        return rct_is_publish;
    }

    public void setRct_is_publish(Integer rct_is_publish) {
        this.rct_is_publish = rct_is_publish;
    }


    @Override
    public String toString() {
        return "Recruit{" +
                "rct_id=" + rct_id +
                ", pos_id=" + pos_id +
                ", rct_title='" + rct_title + '\'' +
                ", rct_introduaction='" + rct_introduaction + '\'' +
                ", rct_publish_time=" + rct_publish_time +
                ", rct_address='" + rct_address + '\'' +
                ", rct_salary=" + rct_salary +
                ", e_id=" + e_id +
                ", rct_is_draft=" + rct_is_draft +
                ", rct_is_publish=" + rct_is_publish +
                '}';
    }
}
