package com.github.andygo298.homeWorkSpring.workDirectory.Task7;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class Task7JavaConfig {

    @Bean("regularTask7")
    @Order(1)
    public Buyer regularBuyer() {
        return new RegularBuyer();
    }

    @Bean("pensionerTask7")
    @Order(2)
    public Buyer pensionerBuyer() {
        return new PensionerBuyer();
    }

    @Bean
    @Order(3)
    public Shop shop(@Qualifier("regularTask7") Buyer buyerReg, @Qualifier("pensionerTask7") Buyer buyerPens) {
        return new Shop(buyerReg, buyerPens);
    }
}
