package com.semir.workflow.repository;

import com.semir.workflow.domain.Flow_Job;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;
/* create by zhanglei 2017.11.27
* Repository for flow job list
*
* */

public interface FlowJobRepository  extends Repository<Flow_Job,Long> {
    //查询所有的job list
    List<Flow_Job> findAll();
    //get flow job list by project order by sequence Asc
    List<Flow_Job> findByProjectIdOrderBySequenceAsc(Long projectId);
    //save flow job
    void save(Flow_Job flow_job);
}