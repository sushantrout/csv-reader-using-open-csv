package com.bip;

import java.io.Serializable;

/**
 * This is simple a Student class whose property is same as data.csv file property
 * @author Sushant
 *
 */
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;

	public String Name, RollNo, Department, Result, cgpa;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRollNo() {
		return RollNo;
	}

	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", RollNo=" + RollNo + ", Department=" + Department + ", Result=" + Result
				+ ", cgpa=" + cgpa + "]";
	}
}
