package java0714_inheritance;

class Parent{
	String name;
	int age;
	public Parent() {
		
	}
	
	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
}//end Parent

class Sun extends Parent {
	String dept;
	
	public Sun() {
		
	}
	public Sun(String name, int age, String dept){
		super(name, age);
		this.dept=dept;
		
	}
	public void prn(){
		System.out.printf("%s %d %s\n", name, age, dept);
	}
	
}//end class

public class Java089_inheritance {

	public static void main(String[] args) {
		Sun ss=new Sun("홍길동", 50, "기획부");
		ss.prn();
		
	}//end main
	
}//end class
