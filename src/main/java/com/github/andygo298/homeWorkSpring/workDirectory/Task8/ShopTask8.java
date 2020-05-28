package com.github.andygo298.homeWorkSpring.workDirectory.Task8;


import java.util.List;

public class ShopTask8 {

    private String nameShop;
    private List<BuyerTask8> buyerTask8s;


    public ShopTask8() {
    }

    public ShopTask8(List<BuyerTask8> buyerTask8s) {
        this.buyerTask8s = buyerTask8s;
    }

    public List<BuyerTask8> getBuyerTask8s() {
        return buyerTask8s;
    }

    public void setBuyerTask8s(List<BuyerTask8> buyerTask8s) {
        this.buyerTask8s = buyerTask8s;
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

