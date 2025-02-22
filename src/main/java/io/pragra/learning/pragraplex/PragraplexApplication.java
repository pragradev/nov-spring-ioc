package io.pragra.learning.pragraplex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class PragraplexApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Honda honda = context.getBean(Honda.class);
        System.out.println(honda);

//        Honda crv = new Honda("Diesel Engine", "Civic", new HydBrake());
//        System.out.println(crv);

        //SpringApplication.run(PragraplexApplication.class, args);
    }

}
