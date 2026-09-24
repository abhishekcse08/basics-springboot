package com.magnus.training.training.controller;

import com.magnus.training.training.employee.Employee;
import com.magnus.training.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class RestTrainingController {

 /*   @Autowired
    EmployeeService es ;*/

    private final EmployeeService es;

    @Autowired
    public RestTrainingController(EmployeeService es) {
        this.es = es;
    }

    @GetMapping("/getEmployee")
    public Map<Integer,Employee> getEmployee(){
        return es.getEmployeeFromDB();
    }

    @PostMapping("/addEmployee")
    public Map<Integer,Employee> addEmployee(@RequestBody Employee e){
        Map<Integer, Employee> employeeFromDB = es.getEmployeeFromDB();
        employeeFromDB.put(5,e);
        return employeeFromDB;
    }

}
