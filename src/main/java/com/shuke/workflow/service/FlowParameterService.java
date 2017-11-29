package com.shuke.workflow.service;

import com.shuke.workflow.domain.Flow_Parameter;

import java.util.List;

/*
* service for flow parameter
* create by zhanglei 2017.11.28
* */
public interface FlowParameterService {
    boolean saveFlowParameter(Flow_Parameter flow_parameter);
    List<Flow_Parameter> findById(Long jobId);
}
