package com.magnus.training.repository;

import com.magnus.training.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
