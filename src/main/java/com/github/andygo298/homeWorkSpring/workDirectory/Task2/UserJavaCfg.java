package com.github.andygo298.homeWorkSpring.workDirectory.Task2;

public class UserJavaCfg {
    private String name;
    private String age;

    public UserJavaCfg() {
    }

    public UserJavaCfg(String name, String age) {
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

    public void hoHoHo() {
        System.out.println("I'm created by Java Config !!!");
    }
}
