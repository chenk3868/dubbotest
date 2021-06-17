package com.itheima.test;

import com.itheima.service.UserService;
import com.itheima.user.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class providerTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext cpc = new ClassPathXmlApplicationContext("spring-service.xml");
        UserService bean = cpc.getBean(UserService.class);
        User byId = bean.findById(1);
        System.out.println(byId);
    }
}
