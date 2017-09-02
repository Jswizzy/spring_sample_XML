package name.smithjn;

import name.smithjn.repository.CustomerRepository;
import name.smithjn.repository.HibernateCustomerRepositoryImpl;
import name.smithjn.service.CustomerService;
import name.smithjn.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"name.smithjn"})
public class AppConfig {

/*    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }*/

/*    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
        //CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
        CustomerServiceImpl service = new CustomerServiceImpl();
        //service.setCustomerRepository(getCustomerRepository());
        return service;
    }*/
}
