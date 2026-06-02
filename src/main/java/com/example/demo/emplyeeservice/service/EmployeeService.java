package com.example.demo.emplyeeservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.emplyeeservice.entity.Employee;
import com.example.demo.emplyeeservice.repository.EmployeeRepository;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee) {

        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {

        return repository.findAll();
    }
    
    public Employee updateEmployee(Long id, Employee employee) {

        Employee existingEmployee =
                repository.findById(id).orElse(null);

        if (existingEmployee != null) {

            existingEmployee.setName(employee.getName());
            existingEmployee.setDepartment(employee.getDepartment());
            existingEmployee.setSalary(employee.getSalary());

            return repository.save(existingEmployee);
        }

        return null;
    }

    public void deleteEmployee(Long id) {

        repository.deleteById(id);
    }


}

