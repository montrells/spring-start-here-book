package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        //(4/5)
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    //(5/5)
//        Parrot p = context.getBean(Parrot.class);
        Parrot p = context.getBean("parrot2", Parrot.class);
        System.out.println(p.getName());


    }
}
