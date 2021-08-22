package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student id is    " + id);
	}

	public void getStudentInfo(String emailid, long phoneno) {
		System.out.println("Student email is   " + emailid);
		System.out.println("Student phonenumber is   " + phoneno);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is     " + id);
		System.out.println("Student name is    " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students obj = new Students();

		obj.getStudentInfo(103);
		obj.getStudentInfo("john@testleaf.com", 123456698);
		obj.getStudentInfo(103, "Testleaf");

	}

}
