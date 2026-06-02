package com.example.demo.emplyeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.emplyeeservice.entity.Employee;


public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {

}


