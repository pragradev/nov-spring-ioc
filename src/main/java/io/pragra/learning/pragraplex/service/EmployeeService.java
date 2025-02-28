package io.pragra.learning.pragraplex.service;

import io.pragra.learning.pragraplex.Employee;
import io.pragra.learning.pragraplex.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EmployeeService {
    String a;
    String b;
    //@Autowired
    EmployeeRepo employeeRepo;
    public EmployeeService(@Qualifier("abc") String msg1, @Qualifier("xyz") String msg2, EmployeeRepo employeeRepo) {
        // Dependency Injection: constructor
        a = msg1;
        b = msg2;
        this.employeeRepo = employeeRepo;
    }

    public Employee getEmpfromDB(){
        Employee employee = employeeRepo.fetchEmployeeFromDB();
        return employee;
    }

}
