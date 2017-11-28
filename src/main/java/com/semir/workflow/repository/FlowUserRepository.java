package com.semir.workflow.repository;

import com.semir.workflow.domain.Flow_User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface FlowUserRepository  extends Repository<Flow_User,Long>{
    //get all user form flow user
    List<Flow_User> findAll();
    //save flow user
    void save(Flow_User flow_user);
    //get user by id
    Flow_User getById(Long id);
}
