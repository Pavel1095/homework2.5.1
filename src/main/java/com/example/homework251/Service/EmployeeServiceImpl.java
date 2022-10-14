package com.example.homework251.Service;

import com.example.homework251.ecxeption.EmployeeNotFoundException;
import com.example.homework251.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> printAll() {
        return employees;
    }

    @Override
    public Employee remove(String name, String surname) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName().equals(name) && employees.get(i).getLastName().equals(surname)) {
                return employees.remove(i);
            }
        }
        throw new EmployeeNotFoundException("Сотрудник не найден.");
    }

    @Override
    public boolean completeCollection() {
        employees.add(new Employee("Иванов","Иван"));
        employees.add(new Employee("Сидоров","Петр"));
        employees.add(new Employee("Карелин","Алексей"));
        employees.add(new Employee("Табуреткин","Роман"));
        employees.add(new Employee("Карпов","Никита"));
        employees.add(new Employee("Воронов","Артем"));
        employees.add(new Employee("Петров","Павел"));
        employees.add(new Employee("Александров","Станислав"));
        return true;
    }

    @Override
    public Employee search (String name, String surname) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName().equals(name) && employees.get(i).getLastName().equals(surname)) {
                return employees.get(i);
            }
        }
        throw new EmployeeNotFoundException("Сотрудник не найден.");
    }
    @Override
    public boolean add(String name, String surname) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName().equals(name) && employees.get(i).getLastName().equals(surname)) {
                throw new EmployeeNotFoundException("Сотрудник с таким ФИО уже есть.");
            }
        }
        return employees.add(new Employee(name,surname));
    }
}
