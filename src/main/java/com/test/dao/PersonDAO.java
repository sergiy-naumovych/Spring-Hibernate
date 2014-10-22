package com.test.dao;

import com.test.model.Person;

import java.util.List;

/**
 * Created by Matrix on 22.10.2014.
 */
public interface PersonDAO {

    public void save(Person person);

    public List<Person> list();
}
