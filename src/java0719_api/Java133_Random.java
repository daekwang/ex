package java0719_api;

import java.util.Random;

public class Java133_Random {

	public static void main(String[] args) {
		Random ran=new Random();
		double r1=ran.nextDouble();//double 값 난수 발생
		System.out.println(r1);
		
		int r2=ran.nextInt();
		System.out.println(r2);//int 값 난수 발생
		
		int r3=ran.nextInt(3);//3 미만의 정수값 발생(0, 1, 2)
		System.out.println(r3);
		
		int r4=ran.nextInt(10);
		r4=r4+1;//1~10까지의 정수값 발생
		System.out.println(r4);
		
		
		
	}//end main
	
}//end class
