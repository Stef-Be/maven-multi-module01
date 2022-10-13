package org.switchfully.api;

import com.google.common.collect.Lists;
import org.switchfully.domain.Person;

import java.util.List;

public class MyApi {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", "The Builder");
        Person person2 = new Person("Beb", "The Boulder");

        List<Person> personList = Lists.newArrayList(person1, person2);

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
