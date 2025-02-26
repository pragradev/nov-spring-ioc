package io.pragra.learning.pragraplex;

import com.sun.security.auth.LdapPrincipal;
import io.pragra.learning.pragraplex.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class PragraplexApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Honda crv = context.getBean("crv", Honda.class);
        System.out.println(crv);


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
