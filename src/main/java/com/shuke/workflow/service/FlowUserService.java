package com.shuke.workflow.service;

import com.shuke.workflow.domain.Flow_User;

import java.util.List;

/*
* service for flow user
* create by zhanglei 2017.11.28
* */
public interface FlowUserService {
    //get all user form flow user
    List<Flow_User> findAll();
    //save flow user
    boolean save(Flow_User flow_user);
    //get user by id
    Flow_User getById(Long id);
}
