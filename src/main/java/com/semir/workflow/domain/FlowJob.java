package com.semir.workflow.domain;

import javafx.scene.text.Text;

import javax.persistence.Entity;

/*
* create by zhanglei 2017.11.27
* entity  for workflow job list detail
*
*
* */
@Entity
public class FlowJob {

    private int id;
    private String type;
    private String script;
    private int dependency;
    private String modifyBy;
    private String modifyTime;
    private int projectId;
    private int sequence;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public int getDependency() {
        return dependency;
    }

    public void setDependency(int dependency) {
        this.dependency = dependency;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FlowJob{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", script='" + script + '\'' +
                ", dependency=" + dependency +
                ", modifyBy='" + modifyBy + '\'' +
                ", modifyTime='" + modifyTime + '\'' +
                ", projectId=" + projectId +
                ", sequence=" + sequence +
                ", status=" + status +
                '}';
    }
}
