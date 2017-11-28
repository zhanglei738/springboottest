package com.semir.workflow.service;

import com.semir.workflow.domain.Flow_Parameter;

import java.util.List;

/*
* service for flow parameter
* create by zhanglei 2017.11.28
* */
public interface FlowParameterService {
    boolean saveFlowParameter(Flow_Parameter flow_parameter);
    List<Flow_Parameter> findById(Long jobId);
}
