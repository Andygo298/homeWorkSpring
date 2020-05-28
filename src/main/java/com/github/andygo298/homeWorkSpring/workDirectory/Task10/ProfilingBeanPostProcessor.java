package com.github.andygo298.homeWorkSpring.workDirectory.Task10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProfilingBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(final Object bean, String beanName) throws BeansException {
        Class type = bean.getClass();
        if (type.isAnnotationPresent(Profiling.class)) {
            Object proxy = Proxy.newProxyInstance(
                    type.getClassLoader(),
                    type.getInterfaces(),
                    new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    long before = System.nanoTime();
                    Object returnValue = method.invoke(bean, args);
                    long after = System.nanoTime();
                    System.out.println("метод работал: "+(after-before)+" наносекунд");
                    return returnValue;
                }
            }
            );
            return proxy;
        } else {
            return bean;
        }
    }

    @Override
    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
        return bean;
    }
}
