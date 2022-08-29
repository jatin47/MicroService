package com.jatin.departmentservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jatin.departmentservice.entity.Department;
import com.jatin.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Optional<Department> findByDepartmentId(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
    
}
