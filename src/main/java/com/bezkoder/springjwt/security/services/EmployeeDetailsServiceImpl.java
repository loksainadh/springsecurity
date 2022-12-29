package com.bezkoder.springjwt.security.services;

import com.bezkoder.springjwt.models.Employee;
import com.bezkoder.springjwt.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public UserDetails loadUserByUsername(String employeeName) throws UsernameNotFoundException {
        Employee employee = employeeRepository.findByEmployeeName(employeeName)
                .orElseThrow(() -> new UsernameNotFoundException("Employee Not Found with username: " + employeeName));
        return EmployeeDetailsImpl.build(employee);
    }
}
