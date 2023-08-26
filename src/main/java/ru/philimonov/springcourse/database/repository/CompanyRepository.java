package ru.philimonov.springcourse.database.repository;

import ru.philimonov.springcourse.bpp.InjectBean;
import ru.philimonov.springcourse.database.pool.ConnectionPool;

public class CompanyRepository {

    @InjectBean
    private ConnectionPool connectionPool;
}
