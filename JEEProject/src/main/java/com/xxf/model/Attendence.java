package com.xxf.model;

import java.util.Date;

public class Attendence {
    private Integer at_id;
    private Integer e_id;
    private Date at_start_time;
    private Date at_end_time;

    public Integer getAt_id() {
        return at_id;
    }

    public void setAt_id(Integer at_id) {
        this.at_id = at_id;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public Date getAt_start_time() {
        return at_start_time;
    }

    public void setAt_start_time(Date at_start_time) {
        this.at_start_time = at_start_time;
    }

    public Date getAt_end_time() {
        return at_end_time;
    }

    public void setAt_end_time(Date at_end_time) {
        this.at_end_time = at_end_time;
    }

    @Override
    public String toString() {
        return "Attendence{" +
                "at_id=" + at_id +
                ", e_id=" + e_id +
                ", at_start_time=" + at_start_time +
                ", at_end_time=" + at_end_time +
                '}';
    }
}
