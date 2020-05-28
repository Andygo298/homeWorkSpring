package com.github.andygo298.homeWorkSpring.workDirectory.Task7;

public class PensionerBuyer implements Buyer {

    private String namePens;
    private String agePens;

    public PensionerBuyer() {
    }

    public String getNamePens() {
        return namePens;
    }

    public void setNamePens(String namePens) {
        this.namePens = namePens;
    }

    public String getAgePens() {
        return agePens;
    }

    public void setAgePens(String agePens) {
        this.agePens = agePens;
    }

    @Override
    public void say() {
        System.out.println("Hello! I'm a Pensioner.");
    }
}
