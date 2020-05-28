package com.github.andygo298.homeWorkSpring.workDirectory.Task5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("order-task5")
public class OrderTask5 {
    private Long idOrder;
    private double price;

    private PersonTask5 personTask5;

    public OrderTask5() {
        System.out.println("Order constructor initiated.");
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PersonTask5 getPersonTask5() {
        return personTask5;
    }

    @Autowired
    public void setPersonTask5(PersonTask5 personTask5) {
        this.personTask5 = personTask5;
    }

    public void sayOrder() {
        System.out.println("Order created! task5");
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", price=" + price +
                ", person=" + personTask5 +
                '}';
    }
}
