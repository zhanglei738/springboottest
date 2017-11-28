package com.semir.workflow.domain;

import javafx.scene.text.Text;

import javax.persistence.*;

/*
* create by zhanglei 2017.11.27
* entity  for workflow job list detail
* column
*
* id
  type
  script
  dependency
  modify_by
  modify_time
  project_id
  sequence
  status
*
* */
@Entity
@Table(name = "flow_job")
public class Flow_Job {
    //id primiary key  auto_increment
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "type", nullable = true)
    private String type;
    @Column(name = "script")
    private String script;
    @Column(name = "dependency")
    private String dependency;
    @Column(name = "modify_by")
    private String modifyBy;
    @Column(name = "modify_time")
    private String modifyTime;
    @Column(name = "project_id")
    private Long projectId;
    @Column(name = "sequence")
    private Integer sequence;
    @Column(name = "status")
    private Integer status;

    public Flow_Job() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
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

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
