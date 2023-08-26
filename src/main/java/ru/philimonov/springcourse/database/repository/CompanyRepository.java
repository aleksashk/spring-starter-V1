package ru.philimonov.springcourse.database.repository;

import ru.philimonov.springcourse.database.pool.ConnectionPool;

public class CompanyRepository {

    private CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    private final ConnectionPool connectionPool;

    public static CompanyRepository of(ConnectionPool connectionPool) {
        return new CompanyRepository(connectionPool);
    }
}
