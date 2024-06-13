package com.example.ems.employee_managment_system.repository;
import com.example.ems.employee_managment_system.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
}