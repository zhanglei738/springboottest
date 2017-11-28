package com.semir.workflow.contorller;

import com.semir.workflow.domain.Flow_Job;
import com.semir.workflow.domain.Flow_Parameter;
import com.semir.workflow.domain.Flow_Project;
import com.semir.workflow.domain.Flow_User;
import com.semir.workflow.repository.FlowJobRepository;
import com.semir.workflow.service.FlowJobService;
import com.semir.workflow.service.FlowParameterService;
import com.semir.workflow.service.FlowProjectService;
import com.semir.workflow.service.FlowUserService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.util.List;

@RestController
public class Test {

   //test controller
  //import flow job service
  @Autowired
    private FlowJobService flowJobService;
  //import flow parameter service
  @Autowired
   private FlowParameterService flowParameterService;
  //import flow project service
  @Autowired
  private FlowProjectService flowProjectService;
  // import flow user service
  @Autowired
  private FlowUserService flowUserService;
  //=================flow_job test========================
    //controller for get job flow list by projectId order by sequence Asc
    @RequestMapping(value = "/flowjob",method = RequestMethod.GET)
    public List<Flow_Job> getAllJob(){
        return flowJobService.findByProject(1L);
    }
     //save  job  to flow job list
  @RequestMapping(value="/savejob",method = RequestMethod.GET)
  public String saveJob(){
      Flow_Job  flow_job = new Flow_Job();
      flow_job.setProjectId(2L);
      flow_job.setSequence(1);
      flow_job.setType("spark");
      String tips="保存成功";
      flowJobService.saveJob(flow_job);
      if(!flowJobService.saveJob(flow_job)){
        tips = "保存失败";
      }

      return  tips ;
  }

  //============flow_parameter test===========
//get flow parameter by job id
  @RequestMapping(value = "/findparameter",method = RequestMethod.GET)
  public List<Flow_Parameter> findByJobId(@Param("jobId") Long jobId){
     return  flowParameterService.findById(jobId);

  }
//save to flow job flow parameter
  @RequestMapping(value = "/saveparameter",method = RequestMethod.GET)
  public  String saveParameter(){
    String mess ="保存成功";
    Flow_Parameter flow_parameter = new Flow_Parameter();
    flow_parameter.setId(1L);
    flow_parameter.setJobId(2L);
    flow_parameter.setName("spark");
    flow_parameter.setValue("shell");
    flowParameterService.saveFlowParameter(flow_parameter);
    if(!flowParameterService.saveFlowParameter(flow_parameter)){
      mess = "保存失败";
    }

    return mess;
  }

//===============flow_project test==================
  //controller for flow project that get flow project by id
@RequestMapping(value = "/project",method = RequestMethod.GET)
  public List<Flow_Project> findById(@Param("id") Long id){
    return  flowProjectService.findById(id);
}

  //controller for flow project that save flow project
  @RequestMapping(value = "/saveproject",method = RequestMethod.GET)
  public String saveProject(){
    String mess = "保存成功";
    Flow_Project flow_project = new Flow_Project();
    flow_project.setId(1L);
    flow_project.setCreateBy("shuke1");
    flow_project.setDescription("kaifeiji1");
    flow_project.setShellPath("/opt/app");
    flow_project.setCreateTime("2017-11-28 17:00:00");
    flowProjectService.save(flow_project);
    if(!flowProjectService.save(flow_project)){
      mess = "保存失败";
    }

    return mess;
  }
  //=====================flow_user===============
  @RequestMapping(value = "/flowuser",method = RequestMethod.GET)
  public  String saveUser(){
    String mess= "保存成功";
    Flow_User flow_user = new Flow_User();
    flow_user.setId(1L);
    flow_user.setActive(1);
    flow_user.setIsAdmin(1);
    flow_user.setPassword("kaifeiji");
    flow_user.setUsername("shuke");
    flowUserService.save(flow_user);
    if(!flowUserService.save(flow_user)){
      mess = "保存失败";
    }
    return  mess;
  }
  @RequestMapping(value = "/finduser",method = RequestMethod.GET)
  public Flow_User getUserById(@Param("id")Long id){
    return  flowUserService.getById(id);
  }

}
