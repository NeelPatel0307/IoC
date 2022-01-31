package com.full.fullexa;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("demo.xml");
        System.out.println("loaded...");
        Student s= context.getBean("stu",Student.class);
        s.cheating();



    }

}
