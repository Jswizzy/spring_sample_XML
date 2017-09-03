package name.smithjn;

import name.smithjn.repository.CustomerRepository;
import name.smithjn.repository.HibernateCustomerRepositoryImpl;
import name.smithjn.service.CustomerService;
import name.smithjn.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"name.smithjn"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }



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
