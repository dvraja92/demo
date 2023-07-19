package com.inoptra.employeedepartmentdemo.controllers;

import com.inoptra.employeedepartmentdemo.services.DepartmentService;
import com.inoptra.employeedepartmentdemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* Supports Account keeping for Employees working under department
* Below are few operations supported by this controller
*  - Get total salary to be paid to a department
*  - Get total salary to be paid to all departments
*  - Get average salary to be paid to a department
*  - Get average salary to be paid to all departments
**/

@RequestMapping("/account/accountstats")
@RestController
public class AccountStatisticsController {

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/all/total")
	public double getTotalSalaryForAllDepartments() {
		return departmentService.getTotalSalaryForAllDepartments();
	}
	
	@GetMapping("/{deptId}/total")
	public double getTotalSalaryForDepartment(@PathVariable String deptId) {
		return departmentService.getTotalSalaryForDepartment(deptId);
	}
	
	@GetMapping("/all/avg")
	public double getAverageSalaryForAllDepartments() {
		return departmentService.getAverageSalaryForAllDepartments();
	}
	
	@GetMapping("/{deptId}/avg")
	public double getAverageSalaryForDepartment(@PathVariable String deptId) {
		return departmentService.getAverageSalaryForDepartment(deptId);
	}
}
