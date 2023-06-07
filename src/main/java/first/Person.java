package first;

public class Person {
	int pid=1;
	String address="345 Luxury,NC";
	int age=12;
	String phone="+14764664646";
	public static void main(String[] args) {
   Person p=new Person();
   p.introduce();
  System.out.println(p.age(25)); 
		
		
	}
	void introduce() {
		System.out.println("Hello");
	}
	public int age(int age) {
		return age;
	}

}
