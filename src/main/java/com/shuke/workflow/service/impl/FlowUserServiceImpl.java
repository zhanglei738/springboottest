package com.shuke.workflow.service.impl;

import com.shuke.workflow.domain.Flow_User;
import com.shuke.workflow.repository.FlowUserRepository;
import com.shuke.workflow.service.FlowUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * impl for flow user
 * create by zhanglei 2017.11.28
 * */
@Service
public class FlowUserServiceImpl implements FlowUserService {

    //import Repository of flow user repository
    @Autowired
    private FlowUserRepository flowUserRepository;
    //get all user
    @Override
    public List<Flow_User> findAll() {
        return flowUserRepository.findAll();
    }

      //save to flow user
    @Override
    public boolean save(Flow_User flow_user) {
        boolean res = true;
        try {
            flowUserRepository.save(flow_user);
        } catch (Exception e ){
            System.out.print(e.getMessage());
            res=false;
        }
        return  res;
    }

    //get flow user by id
    @Override
    public Flow_User getById(Long id) {
        return flowUserRepository.getById(id);
    }
}
