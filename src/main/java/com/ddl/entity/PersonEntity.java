package com.ddl.entity;

public class PersonEntity{

    private int pid;

    private String name;

    private String pwd;

    public PersonEntity() {
    }

    public PersonEntity(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}