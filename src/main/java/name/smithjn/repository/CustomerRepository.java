package name.smithjn.repository;

import name.smithjn.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
