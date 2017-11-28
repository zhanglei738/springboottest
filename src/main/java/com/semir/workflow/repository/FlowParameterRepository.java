package com.semir.workflow.repository;

import com.semir.workflow.domain.Flow_Parameter;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface FlowParameterRepository extends Repository<Flow_Parameter,Long> {
      List<Flow_Parameter> findAll();
}
