package ru.philimonov.springcourse.database.repository;

import ru.philimonov.springcourse.database.pool.ConnectionPool;

public class CompanyRepository {

    public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    private final ConnectionPool connectionPool;
}
