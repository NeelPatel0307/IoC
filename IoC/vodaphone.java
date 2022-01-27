package com.spring.IoC;

public class vodaphone implements sim {
    public void calling() {
        System.out.println("calling using airtel sim");

    }


    public void data() {
        System.out.println("data by airtel");
    }
}
