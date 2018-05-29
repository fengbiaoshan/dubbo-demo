package com.miexample.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Provider
 *
 * @author reck
 * @date 2018/05/29
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        // press any key to exit
        System.in.read();
    }
}
