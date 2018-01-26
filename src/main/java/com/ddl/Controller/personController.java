package com.ddl.Controller;

import com.ddl.dao.PersonDao;
import com.ddl.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class personController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping(value = "getp")
    public String getPersonAll(){
        System.out.println("触发");
        List<PersonEntity> persons = personDao.getPersons();
        for (PersonEntity person : persons) {
            System.out.println(person.getName());
        }
        return "success";
    }















}
