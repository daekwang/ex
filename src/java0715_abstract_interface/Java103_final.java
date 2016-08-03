package java0715_abstract_interface;
/*
 * final
 * 1 변수 : 상수 
 *   int num=10;
 *    num=20;
 *   final int data=5;
 *    data=10;(X)
 * 2 메소드 : 오버라이딩 할 수 없다.
 *   final void prn(){}   
 * 3 클래스 : 상속을 할 수 없다.
 *    final class Test{ }  
 */

class FinalTest{
	final int CODE=1;
	
	final void precess(){
		System.out.println("process");
	}
	
	void call(){
		System.out.println("call");
	}
	
}//end FinalTest

class UserFinal extends FinalTest{
	@Override
	void call() {
		super.call();
	}
	
	//void process() -> final 메소드는 오버라이딩이 안됨
}

final class Basic{
	
}

//class Expand extends Basic{} ->final 클래스는 상속자체가 안됨


public class Java103_final {

	public static void main(String[] args) {
		
	}//end main()
	
}//end class
