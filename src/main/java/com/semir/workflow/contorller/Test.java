package com.semir.workflow.contorller;

import com.semir.workflow.domain.Flow_Job;
import com.semir.workflow.repository.FlowJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test {

    @Autowired
    private FlowJobRepository flowJobRepository;

    @RequestMapping(value = "/flowjob",method = RequestMethod.GET)
    public List<Flow_Job> getAllJob(){
        return flowJobRepository.findAll();
    }





}
