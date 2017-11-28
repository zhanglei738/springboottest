package com.semir.workflow.contorller;

import com.semir.workflow.domain.Flow_Job;
import com.semir.workflow.repository.FlowJobRepository;
import com.semir.workflow.service.FlowJobService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test {

  @Autowired
    private FlowJobService flowJobService;


    @RequestMapping(value = "/flowjob",method = RequestMethod.GET)
    public List<Flow_Job> getAllJob(){
        return flowJobService.findByProject(1L);
    }
//    @RequestMapping(value = "/aaa",method = RequestMethod.GET)
//  public String getAll(){
//        return "aaa";
//  }
// @RequestMapping(value = "/find",method = RequestMethod.GET)
//    public List<Flow_Job> getAllProject(){
      //return flowJobRepository.findByProjectIdOrderBySequenceAsc(1L);






}
