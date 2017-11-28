package com.semir.workflow.service;

import com.semir.workflow.domain.Flow_Job;

import java.util.List;

/*
*
* */
public interface FlowJobService {
    //get all job list by projectId Asc
    List<Flow_Job> findByProject(Long projectId);
}
