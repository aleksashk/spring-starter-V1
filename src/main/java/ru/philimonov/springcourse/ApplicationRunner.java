package ru.philimonov.springcourse;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.philimonov.springcourse.database.pool.ConnectionPool;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getBean("p4", ConnectionPool.class));

    }
}
