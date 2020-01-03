package org.example.employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @RequestMapping("/employees")
    public List<Employee> getEmployees(){
        return Arrays.asList(
                new Employee("001","Steve","Jobs"),
                new Employee("002","Bill","Gates"),
                new Employee("003","Mark","Zuckerberg")
        );
    }
}
