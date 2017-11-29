package com.shuke.workflow.repository;

import com.shuke.workflow.domain.Flow_Parameter;
import org.springframework.data.repository.Repository;

import java.util.List;
/*create by zhanglei 2017.11.28
Repository for flow parameter
* */
public interface FlowParameterRepository extends Repository<Flow_Parameter,Long> {
     //save parameter to flow_parameter
     void save(Flow_Parameter flow_parameter);
     //find parameter by job id
     List<Flow_Parameter> findByJobId(Long jobId);
}
