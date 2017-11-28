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
    List<Flow_Job>  findAll();
    //通过id查询job
    //List<Flow_Job> findById(int id);
    //通过protect的id进行查询
    //List<Flow_Job> findByProjectIdOrderByIdIdAsc(int projectId);
    //保存

}