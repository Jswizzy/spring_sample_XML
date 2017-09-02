package name.smithjn.service;

import name.smithjn.model.Customer;
import name.smithjn.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {
    }

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Constructor Injection");
        this.customerRepository = customerRepository;
    }

    //@Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Setter Injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
