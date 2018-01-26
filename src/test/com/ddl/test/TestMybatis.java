package com.ddl.test;

import com.ddl.dao.PersonDao;
import com.ddl.entity.PersonEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TestMybatis {

    //测试mybatis
    private  static  SqlSession session;
    static {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            session=sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void getPersonAll(){
        PersonDao personDao = session.getMapper(PersonDao.class);
        List<PersonEntity> personEntities= personDao.getPersons();
        for (PersonEntity p : personEntities) {
            System.out.println(p.toString());
        }

    }











}
