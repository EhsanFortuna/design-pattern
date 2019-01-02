package com.designpattern.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingletonPatternApplication.class, args);

        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;

        if(s1==s2){
            System.out.println("Both of them are the same.");
        }

    }

}

