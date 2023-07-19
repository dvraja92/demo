package com.inoptra.employeedepartmentdemo.models;

import javax.persistence.*;
import java.util.List;

/* @Author: Shrikrishna Prabhumirashi
 * @Description:
 * SalaryComponent is dependent upon base salary and can be calculated as baseSalary multiplied by respective factor.
 *  i.e. SalaryComponent_amount = baseSalary * factor;
 *  Actual salary can be calculated as sum of all SalaryComponent amounts.
 * */
@Entity
public class Salary {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private double baseSalary;

	@OneToMany(cascade = CascadeType.PERSIST ,mappedBy = "salary")
	private List<SalaryComponent> salaryComonents;

	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public List<SalaryComponent> getSalaryComonents() {
		return salaryComonents;
	}
	public void setSalaryComonents(List<SalaryComponent> salaryComonents) {
		this.salaryComonents = salaryComonents;
	}
	
}
