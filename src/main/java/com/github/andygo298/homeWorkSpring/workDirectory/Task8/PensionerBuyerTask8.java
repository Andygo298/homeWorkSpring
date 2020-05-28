package com.github.andygo298.homeWorkSpring.workDirectory.Task8;

public class PensionerBuyerTask8 implements BuyerTask8 {

    private String namePens;
    private String agePens;

    public PensionerBuyerTask8() {
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
