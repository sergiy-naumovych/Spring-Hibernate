package com.test.main;

import com.test.dao.PersonDAO;
import com.test.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Matrix on 22.10.2014.
 */
public class SpringHibernateMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        PersonDAO personDAO = context.getBean(PersonDAO.class);

        Person person = new Person();
        person.setName("Pankaj"); person.setCountry("India");

        personDAO.save(person);

        System.out.println("Person::"+person);

        List<Person> list = personDAO.list();

        for(Person p : list){
            System.out.println("Person List::"+p);
        }
        //close resources
        context.close();
    }
}
