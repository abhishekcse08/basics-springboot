package com.magnus.training.training.service;

import com.magnus.training.training.employee.Employee;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public Map<Integer, Employee> getEmployeeFromDB() {
       return createEmployees();
    }

    @Override
    public Map<Integer, Employee> addEmployee(Employee emp) {
        Map<Integer, Employee> employees = createEmployees();
        employees.put(5,emp);
        return employees;
    }

    @Override
    public Map<Integer, Employee> createEmployee() {
        return createEmployees();
    }


    @Override
    public Map<Integer, Employee> deleteEmployee(int id) {
        Map<Integer, Employee> employees = createEmployees();
        employees.remove(id);
        return employees;
    }


    private Map<Integer,Employee> createEmployees() {
        Employee e1 = new Employee(1, "Jhon", "OPS");
        Employee e2 = new Employee(2, "Kenneth", "IT");
        Employee e3 = new Employee(3, "Danny", "HR");
        Employee e4 = new Employee(4, "Alice", "DEVOPS");
        Map<Integer, Employee> empMap = new HashMap<>();

        empMap.put(1, e1);
        empMap.put(2, e2);
        empMap.put(3, e3);
        empMap.put(4, e4);

        return empMap;
    }
}
