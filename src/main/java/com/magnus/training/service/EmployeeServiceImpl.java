package com.magnus.training.service;

import com.magnus.training.employee.EmployeeDTO;
import com.magnus.training.entity.Employee;
import com.magnus.training.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EmployeeServiceImpl implements EmployeeService{


   /* @Autowired
    EmployeeRepository employeeRepository;*/

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeDTO> getEmployeeFromDB() {
        List<Employee> all = employeeRepository.findAll();
        /*List<EmployeeDTO> list = all.stream()
                .map(empDBData -> {
                    EmployeeDTO employeeDTO = new EmployeeDTO(
                            empDBData.getId()
                            , empDBData.getName()
                            , empDBData.getDepartment()
                            , empDBData.getContactNo()
                            , empDBData.getSalary());
                    return employeeDTO;
                })
                .toList();
*/
        List<EmployeeDTO> list = new ArrayList<>();
        for (Employee empDBData:all){
            EmployeeDTO employeeDTO = new EmployeeDTO(
                    empDBData.getId()
                    , empDBData.getName()
                    , empDBData.getDepartment()
                    , empDBData.getContactNo()
                    , empDBData.getSalary());
            list.add(employeeDTO);
        }
       return list;
    }

    @Override
    public EmployeeDTO addEmployee(EmployeeDTO emp) {
       // Creating DB object and setting data to DB object from DTO
        Employee employee = new Employee();
        employee.setName(emp.getName());
        employee.setDepartment(emp.getDeptName());
        employee.setContactNo(emp.getContactNo());
        employee.setSalary(emp.getSalary());
        //Saving data to DB
        Employee empDBData = employeeRepository.save(employee);

        //Creating new DTO and setting data from DB
        EmployeeDTO employeeDTO = new EmployeeDTO(
                empDBData.getId(),empDBData.getName(),empDBData.getDepartment()
                ,empDBData.getContactNo(),empDBData.getSalary());
        return employeeDTO;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }


}
