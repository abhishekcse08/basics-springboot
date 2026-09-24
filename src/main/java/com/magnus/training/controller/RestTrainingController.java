package com.magnus.training.controller;

import com.magnus.training.service.EmployeeService;
import com.magnus.training.employee.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class RestTrainingController {

 /*   @Autowired
    EmployeeService es ;*/

    @Autowired
    EmployeeService es;

    @GetMapping("/getEmployee")
    public Map<Integer, EmployeeDTO> getEmployee(){
        return es.getEmployeeFromDB();
    }

    @PostMapping("/addEmployee")
    public Map<Integer, EmployeeDTO> addEmployee(@RequestBody EmployeeDTO e){
        Map<Integer, EmployeeDTO> employeeFromDB = es.getEmployeeFromDB();
        employeeFromDB.put(5,e);
        return employeeFromDB;
    }

}
