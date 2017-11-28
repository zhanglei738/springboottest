package com.semir.workflow.service.impl;

import com.semir.workflow.domain.Flow_Project;
import com.semir.workflow.repository.FlowProjectRepository;
import com.semir.workflow.service.FlowProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
* impl for flow project service
* */
@Service
public class FlowProjectServiceImpl implements FlowProjectService {
    //import Repository of flow project
    @Autowired
    private FlowProjectRepository flowProjectRepository;
    //return all flow project
    @Override
    public List<Flow_Project> findAll() {
        return  flowProjectRepository.findAll();

    }
     //save flow project
    @Override
    public boolean save(Flow_Project flow_project) {
        boolean res = true;
        try{
            flowProjectRepository.save(flow_project);
        }catch (Exception e ){
            System.out.print(e.getMessage());
            res=false;
        }
        return res;
    }

    // return flow project by id
    @Override
    public List<Flow_Project> findById(Long id) {
        return flowProjectRepository.findById(id);
    }
}
