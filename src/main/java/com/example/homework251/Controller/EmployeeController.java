package com.example.homework251.Controller;

import com.example.homework251.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee/")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public String welcome (){
        return "<h1> Добро пожаловать! </h1>";}

    @GetMapping("/printAll")
    public List<Employee> printAllEmployee(){
        return employeeService.printAllEmployee();
    }

    @GetMapping("/sumSalary")
    public String getCalculateSumSalary() {
        String calculateSumSalary = employeeService.getCalculateSumSalary();
        return calculateSumSalary;
    }

    @GetMapping("/minSalary")
    public String getEmployeeMinSalary() {
        String employeeMinSalary = employeeService.getEmployeeMinSalary();
        return employeeMinSalary;
    }

    @GetMapping("/averageSalary")
    public String getAverageSalaryEmployee() {
        String averageSalaryEmployee = employeeService.getAverageSalaryEmployee();
        return averageSalaryEmployee;
    }
}
