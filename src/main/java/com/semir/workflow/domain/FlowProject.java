package com.semir.workflow.domain;
/*
* create by zhanglei 2017.11.27
* entity  for work  flow  project  detail
*
*
* */

public class FlowProject {
    private int id;
    private String createTime;
    private String CreateBy;
    private String description;
    private String shellPath;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return CreateBy;
    }

    public void setCreateBy(String createBy) {
        CreateBy = createBy;
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

    @Override
    public String toString() {
        return "FlowProject{" +
                "id=" + id +
                ", createTime='" + createTime + '\'' +
                ", CreateBy='" + CreateBy + '\'' +
                ", description='" + description + '\'' +
                ", shellPath='" + shellPath + '\'' +
                '}';
    }
}
