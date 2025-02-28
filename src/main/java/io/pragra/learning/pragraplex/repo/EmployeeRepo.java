package io.pragra.learning.pragraplex.repo;

import io.pragra.learning.pragraplex.Employee;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepo {
    @Value("#{'${url}'.substring(4)}")
    String url;
    @Value("${username}")
    String username;
    @Value("${password}")
    String password;

    @PostConstruct // init-method
    public void init(){
        // establish connection with database
    }
    @PreDestroy
    public void destry(){
        // disconnect connection with database
    }

    public Employee fetchEmployeeFromDB(){
        System.out.println(url+username+password);
        Employee employee = new Employee("Karan");
        employee.setFirstName("Karan");
        employee.setLastName("B");
        return employee;
    }

    public Employee saveEmp( Employee employee){
        // write db code to save employee
        return employee;
    }

    public boolean deleteEmp(Employee employee){
        // write code to delete emp
        return true;
    }

}
