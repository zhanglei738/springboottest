package com.semir.workflow.domain;


import javax.persistence.*;
/*
* create by zhanglei 2017.11.27
* entity  for workflow project  list detail
* column
*
* id
  create_time
  create_by
  description
  shell_path
*
* */
@Entity
@Table(name="flow_project")
public class Flow_Project {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="create_time")
    private String createTime;
    @Column(name="create_by")
    private String createBy;
    @Column(name="description")
    private String description;
    @Column(name="shell_path")
    private String shellPath;

    public Flow_Project(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShellPath() {
        return shellPath;
    }

    public void setShellPath(String shellPath) {
        this.shellPath = shellPath;
    }
}

