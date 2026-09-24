package com.magnus.training.training.service;

import com.magnus.training.training.employee.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface EmployeeService {

Map<Integer, Employee> getEmployeeFromDB();
Map<Integer, Employee> addEmployee(Employee emp);
Map<Integer, Employee> createEmployee();
Map<Integer, Employee> deleteEmployee(int id);

}
