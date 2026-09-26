package com.magnus.training.repository;

import com.magnus.training.employee.EmployeeDTO;
import com.magnus.training.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query("Select e from Employee e where e.name = :name")
    Employee findEmployeeByName(@Param("name") String name);

    @Query("""
            select e , m from Employee e JOIN Manager m ON e.department = m.department
            """)
    List<Object[]> findByDeptAndManage();
}
