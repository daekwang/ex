package java0719_api;

import static java.lang.Math.*;

public class Java131_Math {

	public static void main(String[] args) {
		//random()-> 0.0에서 1.0미만의 난수가 발생이 된다
		double ran=random();
		ran=ran*10; //0.0~10.0 미만의 난수가 발생이 된다
		//0에서 10미만의 난수가 발생(소수점 버리고 정수값만 가져온다)
		//floor메소드는 반올림하지 않고 무조건 버린다
		int num=(int)floor(ran);
		System.out.println(num);
		
		
		
	}//end main
	
}//end class
