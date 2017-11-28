package com.semir.workflow.contorller;

import com.semir.workflow.domain.Flow_Job;
import com.semir.workflow.domain.Flow_Parameter;
import com.semir.workflow.domain.Flow_Project;
import com.semir.workflow.domain.Flow_User;
import com.semir.workflow.repository.FlowJobRepository;
import com.semir.workflow.repository.FlowParameterRepository;
import com.semir.workflow.repository.FlowProjectRepository;
import com.semir.workflow.repository.FlowUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*create by zhanglei 2017.11.27
*
* */
@RestController
public class Test {
  //import flow job  repository
  @Autowired
    private FlowJobRepository flowJobRepository;
  //import flow parameter  repository
  @Autowired
    private FlowParameterRepository flowParameterRepository;

  @Autowired
  //import flow project  repository
    private FlowProjectRepository flowProjectRepository;
  @Autowired
  //import flow user repository
  private FlowUserRepository flowUserRepository;
  @RequestMapping(value = "/flowjob",method = RequestMethod.GET)
   public List<Flow_Job> getAllFlowJob(){
    return flowJobRepository.findAll();
  }
 @RequestMapping(value="/fp",method = RequestMethod.GET)
  public List<Flow_Parameter> getAllFlowParameter(){
     return  flowParameterRepository.findAll();
 }
 @RequestMapping(value="/fpro",method = RequestMethod.GET)
    public List<Flow_Project> getAllProject(){
      return  flowProjectRepository.findAll();
 }

 @RequestMapping(value = "fu",method = RequestMethod.GET)
    public List<Flow_User> getAllFlowUser(){
        return flowUserRepository.findAll();
 }


}
