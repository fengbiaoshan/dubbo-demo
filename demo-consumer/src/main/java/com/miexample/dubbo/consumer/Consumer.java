package com.miexample.dubbo.consumer;

import com.miexample.dubbo.common.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        // obtain proxy object for remote invocation
        DemoService demoService = (DemoService) context.getBean("demoService");
        // execute remote invocation
        String hello = demoService.sayHello("world");
        // show the result
        System.out.println(hello);
    }
}
