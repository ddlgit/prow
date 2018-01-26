package com.ddl.dao;

import com.ddl.entity.PersonEntity;

import java.util.List;

public interface PersonDao {

    public List<PersonEntity> getPersons();

    public List<PersonEntity> getPersonslike(String name);

    public void addPerson(PersonEntity personEntity);

    public void deletePerson(int pid);

    public void upPerson(PersonEntity personEntity);







}
