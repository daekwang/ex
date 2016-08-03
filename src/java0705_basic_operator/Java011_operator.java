package java0705_basic_operator;

public class Java011_operator {

	public static void main(String[] args) {
		int x=5;
		int y=3;
		int z=5;
		
		System.out.println(true && true); //true
		System.out.println(false || true); //true
		System.out.println(!true); //false
		
		System.out.println(x>y && x==z); //true 
		System.out.println(x<=y || x>y); //true
		
		System.out.println(x<y && x==z); //false
		
		
		

	}//end main

}//end class
