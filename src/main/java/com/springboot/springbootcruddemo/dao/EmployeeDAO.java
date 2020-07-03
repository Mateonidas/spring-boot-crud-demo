package com.springboot.springbootcruddemo.dao;

import com.springboot.springbootcruddemo.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeDAO {

    @Transactional
    List<Employee> findAll();

    @Transactional
    Employee findById(int id);

    @Transactional
    void save(Employee employee);

    @Transactional
    void deleteById(int id);
}
