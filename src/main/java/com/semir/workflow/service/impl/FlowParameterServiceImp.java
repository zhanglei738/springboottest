package com.semir.workflow.service.impl;

import com.semir.workflow.domain.Flow_Parameter;
import com.semir.workflow.repository.FlowParameterRepository;
import com.semir.workflow.service.FlowParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* impl for flow parameterservice
* create by zhanglei 2017.11.28
* */
@Service
public class FlowParameterServiceImp implements FlowParameterService {
    //import flowparameter repository
    @Autowired
    private FlowParameterRepository flowParameterRepository;
    @Override
    public boolean saveFlowParameter(Flow_Parameter flow_parameter) {
        boolean res = true;
        try{
            flowParameterRepository.save(flow_parameter);
        }
        catch (Exception e){
            System.out.print(e.getMessage());
            res=false;
        }
        return res;
    }

    @Override
    //find by job id
    public List<Flow_Parameter> findById(Long jobId) {
        return  flowParameterRepository.findByJobId(jobId);

    }
}
