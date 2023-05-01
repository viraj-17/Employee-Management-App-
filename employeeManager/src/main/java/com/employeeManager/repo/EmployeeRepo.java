package com.employeeManager.repo;

import com.employeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


// for performing operation on database
public interface EmployeeRepo extends JpaRepository<Employee,Long> {



    Optional<Employee> findEmployeeById(Long id);
    void deleteEmployeeById(Long id);
}
