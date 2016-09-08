package com.rpc;

import com.rpc.Core.ServiceRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by paladintyrion on 16/9/6.
 *
 * @author <a href="mailto: paladinosmenttt@sina.com" /> paladintyrion
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServiceRegistry serviceRegistry = (ServiceRegistry)appContext.getBean("serviceRegistry");
        System.out.println(serviceRegistry.getRegistryAddress());
    }
}
