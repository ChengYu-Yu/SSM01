package com.ycy.test;

import com.ycy.domain.Account;
import com.ycy.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试spring配置
 */
public class TestSpring {
    @Test
    public void run1(){
        //1.加载配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //2.获取对象
        IAccountService accountService = ac.getBean("accountService", IAccountService.class);
        //3.调用方法
        accountService.findAll();

    }
}
