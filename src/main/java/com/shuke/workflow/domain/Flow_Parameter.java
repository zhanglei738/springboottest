package com.shuke.workflow.domain;

import javax.persistence.*;

/*create by zhanglei  2017.11.27
entity for flow_parameter
id
job_id
type
name
value
* */
@Entity
@Table(name="flow_parameter")
public class Flow_Parameter {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="job_id")
    private Long jobId;
    @Column(name="type")
    private Long type;
    @Column(name="name")
    private String name;
    @Column(name="value")
    private String value;
    public Flow_Parameter(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
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
}
