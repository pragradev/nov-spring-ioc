package io.pragra.learning.pragraplex.config;

import io.pragra.learning.pragraplex.Honda;
import io.pragra.learning.pragraplex.MechBrake;
import io.pragra.learning.pragraplex.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Honda crv(){
        Honda honda = new Honda("Petrol Engine","crv", mechBrake() );
        return honda;
    }
    @Bean
    public MechBrake mechBrake(){
        MechBrake mechBrake = new MechBrake();
        return mechBrake;
    }

    @Bean
    public String abc(){
        return "abc";
    }

    @Bean
    public String xyz(){
        return "xyz";
    }

    @Bean
    public String firstName(){
        return "Karan";
    }


//    @Bean
//    public EmployeeService employeeService(){
//        return new EmployeeService();
//    }

    /*
    * <bean name="crv" class="io.pragra.learning.pragraplex.Honda">
        <constructor-arg name="engine" value="Petrol Engine"></constructor-arg>
        <constructor-arg name="name" value="crv"></constructor-arg>
        <constructor-arg name="brake" ref="mechBrake"></constructor-arg>
    </bean>
    *
    *     <bean name="mechBrake" class="io.pragra.learning.pragraplex.MechBrake"></bean>

    * */
}
