package com.magnus.training.employee;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDTO {

    private int id;
    private String name;
    private String deptName;
    private String contactNo;
    private Long salary;

    public EmployeeDTO() {
        System.out.println("1-: Bean is created");
    }

    public EmployeeDTO(int id, String name, String deptName, String contactNo, Long salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.contactNo = contactNo;
        this.salary = salary;
    }

    @PostConstruct
    public void init(){
        System.out.println("2-: Initiation of bean (Post construct called) ");
    }

    public void performSomeTask(){
        System.out.println("3-: Executing tasks");
    }

    @PreDestroy
    public  void preDestroyCleanUp(){

        System.out.println("4-: Pre destroy called");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
