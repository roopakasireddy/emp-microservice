package com.example.demo.emplyeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.emplyeeservice.entity.Employee;
import com.example.demo.emplyeeservice.service.EmployeeService;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee saveEmployee(
            @RequestBody Employee employee) {

        return service.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {

        return service.getAllEmployees();
    }
    
    @PutMapping("/{id}")
    public Employee updateEmployee(
            @PathVariable Long id,
            @RequestBody Employee employee) {

        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(
            @PathVariable Long id) {

        service.deleteEmployee(id);

        return "Employee Deleted Successfully";
    }

}

