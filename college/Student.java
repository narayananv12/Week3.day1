package org.college;

public class Student extends Department {
	
	public void StudentName() {
		System.out.println("Student Name is Darren ");
	}

	public void StudentDept() {
		System.out.println("Student Department is CS ");
	}

	public void Studentid() {
		System.out.println("Student id is 201 ");
	}

	public static void main(String[] args) {

		Student obj = new Student();
		obj.StudentName();
		obj.StudentDept();
		obj.Studentid();
		System.out.println("Multilevel Inhertiance call");
		Department obj1 = new Department();
		obj1.collegecode();
		obj1.collegeName();
		obj1.collegerank();
		obj.DepartmentName();

	}


}
