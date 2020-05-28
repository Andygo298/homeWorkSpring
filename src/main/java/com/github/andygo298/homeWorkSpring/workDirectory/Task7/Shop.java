package com.github.andygo298.homeWorkSpring.workDirectory.Task7;


public class Shop {

    private String nameShop;

    private Buyer regBuyer;
    private Buyer pensBuyer;

    public Shop() {
    }

    public Shop(Buyer buyerReg, Buyer buyerPens) {
        this.regBuyer = buyerReg;
        this.pensBuyer = buyerPens;
    }

    public Buyer getRegBuyer() {
        return regBuyer;
    }
    public void setRegBuyer(Buyer regBuyer) {
        this.regBuyer = regBuyer;
    }

    public Buyer getPensBuyer() {
        return pensBuyer;
    }

    public void setPensBuyer(Buyer pensBuyer) {
        this.pensBuyer = pensBuyer;
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public void shopMessage(){
        System.out.println("Hello buyers! Shop is opening!");
    }
}

