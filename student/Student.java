package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("Swetha");
	}
	
	public void studentDept()
	{
		System.out.println("BTECH IT");
	}
	public void studentID()
	{
		System.out.println("13600");
	}
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentID();
		stu.studentDept();
	}

}
