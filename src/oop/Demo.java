package oop;
class Person {
	
	String name;
	String email;
	String phone;
	
	public void walk(){
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(email);
	}
	
	void sleep (){
		System.out.println(name + " is sleeping" );
		
	}
	
}
public class Demo {

	public static void main(String[] args) {
	
		Person person1 = new Person();
		
		person1.name="Fardeen";
		person1.email = "fardeen@test.com";
		person1.phone = "1123456789";
				
     System.out.println(person1.phone);
     person1.walk();
	}

}
