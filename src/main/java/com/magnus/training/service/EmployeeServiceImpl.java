package com.magnus.training.service;

import com.magnus.training.employee.EmployeeDTO;
import com.magnus.training.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Map<Integer, EmployeeDTO> getEmployeeFromDB() {
       return createEmployees();
    }

    @Override
    public Map<Integer, EmployeeDTO> addEmployee(EmployeeDTO emp) {
        Map<Integer, EmployeeDTO> employees = createEmployees();
        //employees.put(5,emp);
        //Employee employee = new Employee(emp.getId(),emp.getName(), emp.getDeptName());
       // employeeJpaService.saveEmployee(employee);
        return employees;
    }

    @Override
    public Map<Integer, EmployeeDTO> createEmployee() {
        return createEmployees();
    }


    @Override
    public Map<Integer, EmployeeDTO> deleteEmployee(int id) {
        Map<Integer, EmployeeDTO> employees = createEmployees();
        employees.remove(id);
        return employees;
    }


    private Map<Integer, EmployeeDTO> createEmployees() {
        EmployeeDTO e1 = new EmployeeDTO(1, "Jhon", "OPS");
        EmployeeDTO e2 = new EmployeeDTO(2, "Kenneth", "IT");
        EmployeeDTO e3 = new EmployeeDTO(3, "Danny", "HR");
        EmployeeDTO e4 = new EmployeeDTO(4, "Alice", "DEVOPS");
        Map<Integer, EmployeeDTO> empMap = new HashMap<>();

        empMap.put(1, e1);
        empMap.put(2, e2);
        empMap.put(3, e3);
        empMap.put(4, e4);

        return empMap;
    }
}
