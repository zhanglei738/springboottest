package com.semir.workflow.service.impl;

import com.semir.workflow.domain.Flow_Job;
import com.semir.workflow.repository.FlowJobRepository;
import com.semir.workflow.service.FlowJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlowJobServiceImpl implements FlowJobService {
    @Autowired
    private FlowJobRepository flowJobRepository;
    @Override
    //return list of flow job order by Sequence Asc
    public List<Flow_Job> findByProject(Long projectId) {

        return flowJobRepository.findByProjectIdOrderBySequenceAsc(projectId);
    }
}
