package com.example.homework251.Service;

import com.example.homework251.ecxeption.EmployeeNotFoundException;
import com.example.homework251.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public abstract class EmployeeServiceImpl implements EmployeeService {

    private final Map<String, Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new HashMap<>();
    }

    @Override
    public List<Employee> printAll() {
        return (List<Employee>) employees;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            return employees.remove(employee.getFullName());
        }
        throw new EmployeeNotFoundException("Сотрудник не найден.");
    }


    @Override
    public Employee search(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if (employees.containsKey(employee.getFullName())) {
            return employees.get(employee.getFullName());
        }

        throw new EmployeeNotFoundException("Сотрудник не найден.");
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeNotFoundException("Сотрудник с таким ФИО уже есть.");
        }
        employees.put(employee.getFullName(), (Employee) employees);
        return employee;
    }

    @Override
    public Collection<Employee> findAll(){
        return Collections.unmodifiableCollection(employees.values());
    }
}
