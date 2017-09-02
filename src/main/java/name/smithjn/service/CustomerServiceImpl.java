package name.smithjn.service;

import name.smithjn.model.Customer;
import name.smithjn.repository.CustomerRepository;
import name.smithjn.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
