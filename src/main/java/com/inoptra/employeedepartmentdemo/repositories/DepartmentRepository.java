package com.inoptra.employeedepartmentdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inoptra.employeedepartmentdemo.models.Department;
import org.springframework.stereotype.Repository;

/**
 * @Author: Shrikrishna Prabhumirashi
 * @Description:
 * Persistence layer which performs operations on Department entity
 **/
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
