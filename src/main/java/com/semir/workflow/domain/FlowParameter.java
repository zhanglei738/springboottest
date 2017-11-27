package com.semir.workflow.domain;
/*
* create by zhanglei 2017.11.27
* entity for work flow job parameter detail
* */

public class FlowParameter {
    private int id;
    private int jobId;
    private int type;
    private String name;
    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "FlowParameter{" +
                "id=" + id +
                ", jobId=" + jobId +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
