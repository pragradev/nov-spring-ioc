package io.pragra.learning.pragraplex;

import com.sun.security.auth.LdapPrincipal;
import io.pragra.learning.pragraplex.config.AppConfig;
import io.pragra.learning.pragraplex.config.AppConfig2;
import io.pragra.learning.pragraplex.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication

@ComponentScan
@EnableAutoConfiguration
@Configuration
public class PragraplexApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PragraplexApplication.class, args);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        Employee employee = employeeService.getEmpfromDB();
        System.out.println(employee);

//        ApplicationContext context = new AnnotationConfigApplicationContext("io.pragra.learning.pragraplex.config" , "io.pragra.learning.pragraplex.anotherConfigPkg");
//        Honda crv = context.getBean("crv", Honda.class);
//        System.out.println(crv);
//        Employee bean = context.getBean("emp1",Employee.class);
//        System.out.println(bean);


//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Honda crv = context.getBean("crv",Honda.class);
//        Honda civic = context.getBean("civic",Honda.class);
//        System.out.println(crv);
//        System.out.println(civic);
//
//        Employee employee = context.getBean("sahil", Employee.class);
//        System.out.println(employee);
//
//        DBConnection connection = context.getBean("mysql", DBConnection.class);
//        System.out.println(connection);
        //context.registerShutdownHook();
//        Honda crv = new Honda("Diesel Engine", "Civic", new HydBrake());
//        System.out.println(crv);

        //SpringApplication.run(PragraplexApplication.class, args);
    }

}
