package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Employee;
import com.bezkoder.springjwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Optional<Employee> findByEmployeeName(String username);

    Boolean existsByEmployeeName(String username);

    Boolean existsByEmail(String email);
}
