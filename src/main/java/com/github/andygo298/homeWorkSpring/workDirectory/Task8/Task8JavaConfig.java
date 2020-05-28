package com.github.andygo298.homeWorkSpring.workDirectory.Task8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.List;

@Configuration
public class Task8JavaConfig {

    @Bean("regular")
    @Order(1)
    public BuyerTask8 regularBuyer() {
        return new RegularBuyerTask8();
    }

    @Bean("pensioner")
    @Order(2)
    public BuyerTask8 pensionerBuyer() {
        return new PensionerBuyerTask8();
    }

    @Bean
    @Order(3)
    public ShopTask8 shop(List<BuyerTask8> buyerTask8s) {
        return new ShopTask8(buyerTask8s);
    }
}
