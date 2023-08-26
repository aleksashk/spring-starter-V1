package ru.philimonov.springcourse;


import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.philimonov.springcourse.database.pool.ConnectionPool;
import ru.philimonov.springcourse.database.repository.CompanyRepository;

public class ApplicationRunner {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("application.xml");) {
            System.out.println(context.getBean("p4", ConnectionPool.class));

            System.out.println(context.getBean("driver"));

            System.out.println(context.getBean("companyRepository", CompanyRepository.class));
        } catch (BeansException e) {
            throw new RuntimeException(e);
        }

    }
}
