package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("config.xml");
        Parrot p = context.getBean(Parrot.class); //Creating a bean out of the Parrot....

        System.out.println(p.getName());
    }
}
