package name.smithjn;

import name.smithjn.service.CustomerService;
import name.smithjn.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        for (int i = 0; i < 2; i++) {
            CustomerService service = applicationContext.getBean("customerService", CustomerService.class);

            System.out.println(service);

            System.out.println(service.findAll().get(0).getFirstname());
        }
    }
}
