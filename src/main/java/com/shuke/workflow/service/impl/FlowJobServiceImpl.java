package com.shuke.workflow.service.impl;

import com.shuke.workflow.domain.Flow_Job;
import com.shuke.workflow.repository.FlowJobRepository;
import com.shuke.workflow.service.FlowJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*impl for flow job service
* create by zhanglei 2017.11.28
* */
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

    @Override
    //save flow job
    public boolean saveJob(Flow_Job flow_job) {
        boolean res = true;
        try{
            flowJobRepository.save(flow_job);
        }
        catch (Exception e){
            System.out.print(e.getMessage());
            res = false;

        }
        return res;
    }


}
