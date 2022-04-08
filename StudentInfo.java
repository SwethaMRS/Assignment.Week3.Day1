package week3.day1;

public class StudentInfo {

	public void getStudentInfo(int id)
	{
		System.out.println("Student ID = "+id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student ID and Name = "+id +name);
	}
	
	public void getStudentInfo(String email, long phoneNumber)
	{
		System.out.println("Student email and mobile number = "+email+phoneNumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentInfo info = new StudentInfo();
		info.getStudentInfo(1001);
		info.getStudentInfo(1001, "SWETHA");
		info.getStudentInfo("swetha@gmail.com", 9876543210L);
	}

}
