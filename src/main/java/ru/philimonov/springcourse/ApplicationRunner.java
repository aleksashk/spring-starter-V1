package ru.philimonov.springcourse;

import ru.philimonov.springcourse.database.pool.ConnectionPool;
import ru.philimonov.springcourse.database.repository.CompanyRepository;
import ru.philimonov.springcourse.database.repository.UserRepository;
import ru.philimonov.springcourse.ioc.Container;
import ru.philimonov.springcourse.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {

        var container = new Container();
//
//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository(connectionPool);
//
//        UserService userService = new UserService(userRepository, companyRepository);
//
//        var connectionPool = container.get(ConnectionPool.class);
//        var userRepository = container.get(UserRepository.class);
//        var companyRepository = container.get(CompanyRepository.class);

        var userService = container.get(UserService.class);

        //// TODO: 26.08.2023 userService
    }
}
