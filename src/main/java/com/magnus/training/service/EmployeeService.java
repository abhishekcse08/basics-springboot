package com.magnus.training.service;

import com.magnus.training.employee.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface EmployeeService {

Map<Integer, EmployeeDTO> getEmployeeFromDB();
Map<Integer, EmployeeDTO> addEmployee(EmployeeDTO emp);
Map<Integer, EmployeeDTO> createEmployee();
Map<Integer, EmployeeDTO> deleteEmployee(int id);

}
