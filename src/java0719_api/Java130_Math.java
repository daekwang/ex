package java0719_api;

/*
 * 클래스에서 static 키워드가 선언된 멤버변수, 메소드를 호출할때
 * import static을 선언하면 클래스명없이 바로 멤버변수, 메소드를 호출할 수 있다
 */


import static java.lang.Math.E;
import static java.lang.Math.sqrt;
import static java.lang.Math.*; //math클래스 전체를 import해오는 것

/*
 * 수학관련 클래스
 * java.lang.Math
 */


public class Java130_Math {

	public static void main(String[] args) {
		System.out.println(PI); //원주율
		System.out.println(max(10, 20));//최대값 리턴
		System.out.println(min(10, 20));//최소값 리턴
		
		//java.lang.Math.E import하고 사용할 수 있다
		System.out.println(E);//지수
		System.out.println(sqrt(25));//제곱근
		System.out.println(pow(2,3));//거듭제곱
		
		
		
	}//end main
	
}//end class
