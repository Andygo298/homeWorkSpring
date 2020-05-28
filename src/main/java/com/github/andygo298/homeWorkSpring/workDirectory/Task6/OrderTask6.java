package com.github.andygo298.homeWorkSpring.workDirectory.Task6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("order-task6")
public class OrderTask6 {
    private Long idOrder;
    private double price;

    private PersonTask6 personTask6;

    public OrderTask6() {
        System.out.println("Order constructor initiated.");
    }
    @Autowired
    public OrderTask6(PersonTask6 personTask6) {
        this.personTask6 = personTask6;
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

    public PersonTask6 getPersonTask6() {
        return personTask6;
    }

    @Autowired
    public void setPersonTask6(PersonTask6 personTask6) {
        this.personTask6 = personTask6;
    }

    public void sayOrder() {
        System.out.println("Order created! task6");
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", price=" + price +
                ", person=" + personTask6 +
                '}';
    }
}
