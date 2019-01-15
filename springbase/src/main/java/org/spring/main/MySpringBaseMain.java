package org.spring.main;

import org.spring.beans.bo.Framework;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringBaseMain {
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml" );
        Framework framework= applicationContext.getBean("frw",Framework.class);

        System.out.println(framework);
    }
}
