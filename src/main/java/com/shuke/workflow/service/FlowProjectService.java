package com.shuke.workflow.service;

import com.shuke.workflow.domain.Flow_Project;

import java.util.List;

public interface FlowProjectService {
    List<Flow_Project> findAll();
    boolean save(Flow_Project flow_project);
    List<Flow_Project> findById(Long id);
}
