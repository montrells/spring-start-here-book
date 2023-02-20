package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // (3/4) Create the application context and send the @Configuration class (ProjectConfig) as a parameter to instruct
        // Spring to use it.
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // (4/4) Gets a reference of type Parrot from Spring context
        //Spring looks for a bean of the type you requested in its context. If such a bean is found, it will be returned, Otherwise Spring will
        //throw an exception.
        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());

        String s = context.getBean(String.class);

        System.out.println(s);

        Integer n = context.getBean(Integer.class);

        System.out.println(n);
    }
}
