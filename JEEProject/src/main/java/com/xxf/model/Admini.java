package com.xxf.model;

public class Admini {
    private Integer a_id;
    private String a_name;
    private String a_pass;

    public Admini() {
    }

    public Admini(String a_name, String a_pass) {
        this.a_name = a_name;
        this.a_pass = a_pass;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_pass() {
        return a_pass;
    }

    public void setA_pass(String a_pass) {
        this.a_pass = a_pass;
    }


    @Override
    public String toString() {
        return "Admini{" +
                "a_id=" + a_id +
                ", a_name='" + a_name + '\'' +
                ", a_pass='" + a_pass + '\'' +
                '}';
    }
}
