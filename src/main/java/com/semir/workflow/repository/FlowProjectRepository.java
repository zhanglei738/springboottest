package com.semir.workflow.repository;

import com.semir.workflow.domain.Flow_Project;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface FlowProjectRepository extends Repository<Flow_Project,Long> {
    List<Flow_Project> findAll();

}
