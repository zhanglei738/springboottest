package com.semir.workflow.repository;

import com.semir.workflow.domain.Flow_User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface FlowUserRepository  extends Repository<Flow_User,Long>{
    List<Flow_User> findAll();
}
