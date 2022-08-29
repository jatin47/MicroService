package com.jatin.departmentservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jatin.departmentservice.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Optional<Department> findByDepartmentId(Long departmentId);
    
}
