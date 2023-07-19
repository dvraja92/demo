package com.inoptra.employeedepartmentdemo.services;

import com.inoptra.employeedepartmentdemo.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Shrikrishna Prabhumirashi
 * @Description:
 * Service layer contract which supports operations on Department object
 **/
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public double getTotalSalaryForAllDepartments() {
        return 0;
    }

    public double getTotalSalaryForDepartment(String deptId) {
        return 0;
    }

    public double getAverageSalaryForAllDepartments() {
        return 0;
    }

    public double getAverageSalaryForDepartment(String deptId) {
        return 0;
    }
}
