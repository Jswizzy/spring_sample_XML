package name.smithjn.repository;

import java.util.ArrayList;
import java.util.List;

import name.smithjn.model.Customer;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Brain");
        customer.setLastname("Hansen");

        customers.add(customer);

        return customers;
    }
}
