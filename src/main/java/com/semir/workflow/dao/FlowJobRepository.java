package com.semir.workflow.dao;

import com.semir.workflow.domain.FlowJob;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import java.util.List;

public interface FlowJobRepository extends JpaRepository<FlowJob,String>{
    FlowJob findAllById(int id);
    List<FlowJob> findAll();

}
