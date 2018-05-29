package com.miexample.dubbo.provider;

import com.miexample.dubbo.common.DemoService;

/**
 * DemoServiceImpl
 *
 * @author reck
 * @date 2018/05/29
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
