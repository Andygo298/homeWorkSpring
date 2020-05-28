package com.github.andygo298.homeWorkSpring.workDirectory.Task7;

public class RegularBuyer implements Buyer {

    private String nameRegular;
    private String ageRegular;

    public RegularBuyer() {
    }

    public String getNameRegular() {
        return nameRegular;
    }

    public void setNameRegular(String nameRegular) {
        this.nameRegular = nameRegular;
    }

    public String getAgeRegular() {
        return ageRegular;
    }

    public void setAgeRegular(String ageRegular) {
        this.ageRegular = ageRegular;
    }

    @Override
    public void say() {
        System.out.println("Hello! I'm a regular buyer.");
    }
}
