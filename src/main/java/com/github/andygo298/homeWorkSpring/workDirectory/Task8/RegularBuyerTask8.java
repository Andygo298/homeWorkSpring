package com.github.andygo298.homeWorkSpring.workDirectory.Task8;

public class RegularBuyerTask8 implements BuyerTask8 {

    private String nameRegular;
    private String ageRegular;

    public RegularBuyerTask8() {
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
