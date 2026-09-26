package com.magnus.training.service;

import com.magnus.training.employee.EmployeeDTO;
import com.magnus.training.entity.Employee;
import com.magnus.training.entity.Manager;
import com.magnus.training.repository.EmployeeRepository;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public EmployeeDTO findEmployeeById(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);

        Employee empDBData = byId.get();
        EmployeeDTO employeeDTO = new EmployeeDTO(
                empDBData.getId()
                , empDBData.getName()
                , empDBData.getDepartment()
                , empDBData.getContactNo()
                , empDBData.getSalary());
      return   employeeDTO;
    }

    @Override
    public EmployeeDTO findEmployeeByName(String name) {

        Employee empDBData = employeeRepository.findEmployeeByName(name);
        EmployeeDTO employeeDTO = new EmployeeDTO(
                empDBData.getId()
                , empDBData.getName()
                , empDBData.getDepartment()
                , empDBData.getContactNo()
                , empDBData.getSalary());
        return   employeeDTO;
    }

    @Override
    public List<Object> findEmployeeAndManager() {

        List<Object[]> byDeptAndManage = employeeRepository.findByDeptAndManage();
        for(Object[] data : byDeptAndManage){
            Employee e = (Employee) data[0];
            Manager m = (Manager) data[1];
        }
        return List.of();
    }



}
