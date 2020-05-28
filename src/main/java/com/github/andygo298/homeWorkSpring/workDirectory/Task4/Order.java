package com.github.andygo298.homeWorkSpring.workDirectory.Task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
    private Long idOrder;
    private double price;

    @Autowired
    private Person person;

    public Order() {
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public void sayOrder(){
        System.out.println("Order created! task4");
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", price=" + price +
                ", person=" + person +
                '}';
    }
}
