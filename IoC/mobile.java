package com.spring.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mobile {

        public static void main(String[] args) {


            ApplicationContext context =
                    new ClassPathXmlApplicationContext("beans.xml");

            System.out.println("confi loaded");

sim sim= context.getBean("sim", sim.class);
sim.calling();
sim.data();
        }

    }


