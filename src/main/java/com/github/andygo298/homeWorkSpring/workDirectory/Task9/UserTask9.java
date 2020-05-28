package com.github.andygo298.homeWorkSpring.workDirectory.Task9;

import com.github.andygo298.homeWorkSpring.workDirectory.Task10.Profiling;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource(value = "classpath:user9.properties", encoding = "UTF-8")
public class UserTask9 {

    @Value("${name}")
    private String nameTask9;
    @Value("${age}")
    private String ageTask9;

    public UserTask9() {
    }

    public UserTask9(String name, String age) {
        this.nameTask9 = name;
        this.ageTask9 = age;
    }

    public String getName() {
        return nameTask9;
    }

    public void setName(String name) {
        this.nameTask9 = name;
    }

    public String getAge() {
        return ageTask9;
    }

    public void setAge(String age) {
        this.ageTask9 = age;
    }

    public void hoHoHo() {
        try {
            Thread.sleep(500);
            System.out.println("I'm was created in task9  !!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "UserTask9{" +
                "nameTask9='" + nameTask9 + '\'' +
                ", ageTask9='" + ageTask9 + '\'' +
                '}';
    }
}
