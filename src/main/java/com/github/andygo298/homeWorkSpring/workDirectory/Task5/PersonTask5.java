package com.github.andygo298.homeWorkSpring.workDirectory.Task5;

import org.springframework.stereotype.Component;

@Component("person-task5")
public class PersonTask5 {
    private String name;
    private String age;

    public PersonTask5() {
        System.out.println("Person constructor initiated.");
    }

    public PersonTask5(String name, String age) {
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

    public void sayPerson() {
        System.out.println("Person created! task5");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
