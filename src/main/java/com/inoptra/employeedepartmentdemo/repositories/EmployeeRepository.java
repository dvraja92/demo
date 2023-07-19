package com.inoptra.employeedepartmentdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inoptra.employeedepartmentdemo.models.Employee;
import org.springframework.stereotype.Repository;

/**
 * @Author: Shrikrishna Prabhumirashi
 * @Description:
 * Persistence layer which performs operations on Employee entity
 **/
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
