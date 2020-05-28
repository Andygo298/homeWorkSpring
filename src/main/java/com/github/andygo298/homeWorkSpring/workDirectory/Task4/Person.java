package com.github.andygo298.homeWorkSpring.workDirectory.Task4;

import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    private String name;
    private String age;

    public Person() {
        System.out.println("Person constructor initiated.");
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public void sayPerson(){
        System.out.println("Person created! task4");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
