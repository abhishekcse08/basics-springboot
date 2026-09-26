package com.magnus.training.controller;

import com.magnus.training.employee.EmpManagerDto;
import com.magnus.training.service.EmployeeService;
import com.magnus.training.employee.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RestTrainingController {

    private final EmployeeService es;

    public RestTrainingController(EmployeeService es) {
        this.es = es;
    }

    @GetMapping("/getEmployee")
    public List<EmployeeDTO> getEmployee(){
        return es.getEmployeeFromDB();
    }

    @PostMapping("/addEmployee")
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO e){
        EmployeeDTO employeeFromDB = es.addEmployee(e);
        return employeeFromDB;
    }

    @DeleteMapping("deleteById/{id}")
    public String deleteEmployeeById(@PathVariable Integer id){
        es.deleteEmployee(id);
        return "Employee deleted!!!";
    }

    @GetMapping("findEmployeeByID")
    public EmployeeDTO findEmployeeById(@RequestParam Integer id){
      return es.findEmployeeById(id);
    }

    @GetMapping("findEmployeeByName")
    public EmployeeDTO findEmployeeByName(@RequestParam String name){
        return es.findEmployeeByName(name);
    }

    @GetMapping("findEmployeeByName")
    public List<EmpManagerDto> findEmployeeManger(){
       // return es.findEmployeeAndManager();
        return null;
    }

}
