package com.magnus.training.service;

import com.magnus.training.employee.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface EmployeeService {

List<EmployeeDTO> getEmployeeFromDB();
EmployeeDTO addEmployee(EmployeeDTO emp);
void deleteEmployee(int id);
EmployeeDTO findEmployeeById(int id);

EmployeeDTO findEmployeeByName(String name);

List<Object> findEmployeeAndManager();

}
