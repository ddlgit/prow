package com.ddl.test;

import com.ddl.dao.PersonDao;
import com.ddl.entity.PersonEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestApplication {

    //测试spring
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        PersonDao personDao = (PersonDao) applicationContext.getBean("personDao");

        List<PersonEntity> persons = personDao.getPersons();

        for (PersonEntity person : persons) {
            System.out.println(person.getName());
        }


    }

}
