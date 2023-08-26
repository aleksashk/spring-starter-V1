package ru.philimonov.springcourse.database.repository;

import ru.philimonov.springcourse.bpp.Auditing;
import ru.philimonov.springcourse.bpp.InjectBean;
import ru.philimonov.springcourse.bpp.Transaction;
import ru.philimonov.springcourse.database.pool.ConnectionPool;
import ru.philimonov.springcourse.entity.Company;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company> {

    @InjectBean
    private ConnectionPool connectionPool;

    @PostConstruct
    private void init() {
        System.out.println("init companyRepository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method");
    }
}
