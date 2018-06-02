package com.alibaba.dubbo.registry.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Registry
 *
 * @author reck
 * @date 2018/06/02
 */
public class Registry {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] {"META-INF/spring/dubbo-demo-registry.xml"});
        context.start();
        // press any key to exit
        System.in.read();
    }

}
