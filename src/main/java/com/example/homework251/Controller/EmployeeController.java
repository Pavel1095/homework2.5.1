package com.example.homework251.Controller;

import com.example.homework251.Service.EmployeeService;
import com.example.homework251.model.Employee;
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
    public String welcome() {
        return "<h1> Добро пожаловать! </h1>";
    }

    @GetMapping("/printAll")
    public List<Employee> printAllEmployee() {
        return employeeService.printAll();
    }

    @GetMapping("/completeCollection")
    public boolean completeCollectionEmployees() {
        return employeeService.completeCollection();
    }

    @GetMapping("/sumSalary")
    public String getCalculateSumSalary() {
        return String.valueOf(employeeService.getCalculateSumSalary());
    }

    @GetMapping("/minSalary")
    public String getEmployeeMinSalary() {
        return String.valueOf(employeeService.getEmployeeMinSalary());
    }

    @GetMapping("/averageSalary")
    public String getAverageSalaryEmployee() {
        return String.valueOf(employeeService.getAverageSalaryEmployee());
    }
}
