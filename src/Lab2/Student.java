package Lab2;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo stu1 = new StudentInfo("Kazi kaniz Fatema", "321456987"); 
		StudentInfo stu2 = new StudentInfo("hen", "987654321"); 
		StudentInfo stu3 = new StudentInfo("Jack", "987456123"); 
		stu1.enroll("Math101");
		stu1.enroll("Science101");
		stu1.enroll("Eng101");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
	}
	
}

class StudentInfo {
	private static int id=0;
	private String userID;
	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance=0;
	
	
	
	public StudentInfo (String name, String SSN) {
		id++;
		this.name = name;
		this.SSN = SSN;
		setUserId();
		setEmail();
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private void setEmail() {
		email = name.toLowerCase() +"." +id + "@gmail.com";
		System.out.println("Your email: " + email);
	}
	private void setUserId() {
		int max = 90;
		int min = 10;
		int randNum = (int) (Math.random() * ((max-min)));
		randNum = randNum + min;
		System.out.println(randNum);
		userID = id +"" +randNum +""+ SSN.substring(5);
		System.out.println("Your User ID:" + userID);
	}
	
	public void enroll(String course) {
		this.courses=this.courses + " " + course; 
		balance = balance + costOfCourse;
		
	}
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("Payment: $" + amount);
	}
	public void checkBalance() {
		System.out.println("Balance: $"+ balance);
	}
	public void showCourses() {
		System.out.println(courses);
	} 
	
	public String toString() {
		return "[Name: " + name + "]\n[Courses: " + courses + "]\n[Balance: " + balance + "]";
	}
}





