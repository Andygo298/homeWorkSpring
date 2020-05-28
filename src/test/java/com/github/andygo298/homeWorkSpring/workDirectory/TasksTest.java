package com.github.andygo298.homeWorkSpring.workDirectory;

import com.github.andygo298.homeWorkSpring.workDirectory.Task1.User;
import com.github.andygo298.homeWorkSpring.workDirectory.Task2.Task2JavaConfig;
import com.github.andygo298.homeWorkSpring.workDirectory.Task2.UserJavaCfg;
import com.github.andygo298.homeWorkSpring.workDirectory.Task3.UserAnnoCfg;
import com.github.andygo298.homeWorkSpring.workDirectory.Task4.Order;
import com.github.andygo298.homeWorkSpring.workDirectory.Task5.OrderTask5;
import com.github.andygo298.homeWorkSpring.workDirectory.Task6.OrderTask6;
import com.github.andygo298.homeWorkSpring.workDirectory.Task7.Shop;
import com.github.andygo298.homeWorkSpring.workDirectory.Task7.Task7JavaConfig;
import com.github.andygo298.homeWorkSpring.workDirectory.Task8.ShopTask8;
import com.github.andygo298.homeWorkSpring.workDirectory.Task8.Task8JavaConfig;
import com.github.andygo298.homeWorkSpring.workDirectory.Task9.UserTask9;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TasksTest {

    @Test
    void createBeanByXmlTest() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-task1");
        User beanUser = context.getBean(User.class);
        beanUser.hoHoHo();
    }

    @Test
    void createBeanByJavaCfgTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Task2JavaConfig.class);
        context.refresh();

        UserJavaCfg bean = context.getBean(UserJavaCfg.class);
        bean.hoHoHo();
    }

    @Test
    void createBeanByAnnoCfgTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(UserAnnoCfg.class);
        context.refresh();

        UserAnnoCfg bean = context.getBean(UserAnnoCfg.class);
        bean.hoHoHo();
        context.close();
    }

    @Test
    void injectBeanByFieldTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.github.andygo298.homeWorkSpring.workDirectory.Task4");
        context.refresh();

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        Order beanOrder = context.getBean(Order.class);
        beanOrder.sayOrder();
        beanOrder.getPerson().sayPerson();

        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }

    @Test
    void injectBeanBySetterTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.github.andygo298.homeWorkSpring.workDirectory.Task5");
        context.refresh();

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        OrderTask5 bean = context.getBean(OrderTask5.class);
        bean.sayOrder();
        bean.getPersonTask5().sayPerson();

        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }

    @Test
    void injectBeanByConstructorTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.github.andygo298.homeWorkSpring.workDirectory.Task6");
        context.refresh();

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        OrderTask6 bean = context.getBean(OrderTask6.class);
        bean.sayOrder();
        bean.getPersonTask6().sayPerson();

        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }

    @Test
    void injectTwoBeansHavingCommonInterfaceTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Task7JavaConfig.class);
        context.refresh();

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        Shop beanShop = context.getBean(Shop.class);

        beanShop.shopMessage();
        beanShop.getPensBuyer().say();
        beanShop.getRegBuyer().say();

        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }

    @Test
    void injectListBeansTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Task8JavaConfig.class);
        context.refresh();

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        ShopTask8 bean = context.getBean(ShopTask8.class);
        bean.shopMessage();
        bean.getBuyerTask8s().forEach(System.out::println);

        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }

    @Test
    void injectValueIntoFieldsByPropertiesFileTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserTask9.class);

        System.setProperty("console.encoding","UTF-8");

        UserTask9 bean = context.getBean(UserTask9.class);
        bean.hoHoHo();
        System.out.println("My name is " + bean.getName() + ", and I'm " + bean.getAge() + " yo.");
    }

}
