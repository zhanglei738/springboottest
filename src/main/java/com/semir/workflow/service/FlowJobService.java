package com.semir.workflow.service;

import com.semir.workflow.domain.Flow_Job;

import java.util.List;

/*
*service for flow job
* create by zhanglei 2018.11.28
* */
public interface FlowJobService {
    //get all job list by projectId Asc
    List<Flow_Job> findByProject(Long projectId);
    //save flow job
    boolean saveJob(Flow_Job flow_job);
}
