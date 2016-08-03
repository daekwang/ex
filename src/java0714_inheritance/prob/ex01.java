package java0714_inheritance.prob;
/*
 * 덧셈 뺄셈만 수행하는 Calculator 클래스를 상속하여 
 * 곱셈 나눗셈까지 수행하는 SuperCalculator 클래스를 구현하시오
 */

class Calculator{
	int x;
	int y;
	public Calculator() {
		
	}
	
	public Calculator(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void add(){
		System.out.println("두 수의 합은 "+(x+y)+"입니다.");
		
	}
	
	public void subtract(){
		System.out.println("두 수의 차는 "+(x-y)+"입니다.");
	}
}

class SuperCalculator extends Calculator{


}


public class ex01 {

	public static void main(String[] args) {
	
		
	}
	
}
