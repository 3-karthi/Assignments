package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName(){
		System.out.println("Student Name: Karthikeyan");
	}
	public void studentDept() {
		System.out.println("Student dept: Computer science");
	}
	public void studentId() {
		System.out.println("Student ID: Hj82637df");
	}
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentDept();
		obj.studentName();
		obj.studentId();
	}
}
