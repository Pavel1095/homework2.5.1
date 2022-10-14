package com.example.homework251.Controller;

import com.example.homework251.Service.EmployeeService;
import com.example.homework251.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/complete")
    public boolean completeCollectionEmployees() {
        return employeeService.completeCollection();
    }

    @GetMapping("/add")
    public boolean add(@RequestParam String name,
                       @RequestParam String surname) {
        return employeeService.add(name, surname);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam String name,
                          @RequestParam String surname) {
        return employeeService.remove(name, surname);
    }

    @GetMapping("/search")
    public Employee search(@RequestParam String name,
                         @RequestParam String surname) {
        return employeeService.search(name, surname);
    }
}
