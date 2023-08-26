package ru.philimonov.springcourse.service;

import ru.philimonov.springcourse.database.repository.CompanyRepository;
import ru.philimonov.springcourse.database.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

    public UserService(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
