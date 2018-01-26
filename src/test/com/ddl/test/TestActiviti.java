package com.ddl.test;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestActiviti {


    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        RepositoryService repositoryService= (RepositoryService) applicationContext.getBean("repositoryService");


//        查询历史流程实例
        HistoryService historyService= (HistoryService) applicationContext.getBean("historyService");
        List<HistoricProcessInstance> historicProcessInstances=historyService.createHistoricProcessInstanceQuery().list();
        for (HistoricProcessInstance historicProcessInstance : historicProcessInstances) {
            System.out.println("流程实例ID:"+historicProcessInstance.getId());
            System.out.println("流程实例开始时间:"+historicProcessInstance.getStartTime());
            System.out.println("流程实例结束时间:"+historicProcessInstance.getEndTime());
            System.out.println("耗时："+historicProcessInstance.getDurationInMillis());
        }


    }





}
