package com.semir.workflow.repository;

import com.semir.workflow.domain.Flow_Project;
import org.springframework.data.repository.Repository;

import java.util.List;
/*
* Repository for flow project
* create by zhanglei 2017.11.28
* */
public interface FlowProjectRepository extends Repository<Flow_Project,Long> {
    //get all flow project
    List<Flow_Project> findAll();
    //save to flow project
    void save(Flow_Project flow_project);
    //get all flow project by
     List<Flow_Project> findById(Long id);

}
