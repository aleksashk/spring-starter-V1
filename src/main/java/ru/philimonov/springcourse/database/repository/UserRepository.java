package ru.philimonov.springcourse.database.repository;

import ru.philimonov.springcourse.database.pool.ConnectionPool;

public class UserRepository {

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    private final ConnectionPool connectionPool;
}
