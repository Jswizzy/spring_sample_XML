package name.smithjn.repository;

import java.util.ArrayList;
import java.util.List;

import name.smithjn.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    @Override
    public List<Customer> findAll() {
        System.out.println(dbUsername);

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Brain");
        customer.setLastname("Hansen");

        customers.add(customer);

        return customers;
    }
}
