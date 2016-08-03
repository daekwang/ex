package java0720_api;

import java.util.GregorianCalendar;

public class Java146_GregorianCalendar {

	public static void main(String[] args) {
		int year=2015;
		GregorianCalendar gre=new GregorianCalendar();
		
		//isLeapYear-> 윤년을 계산해주는 메소드이다
		if(gre.isLeapYear(year)){
			System.out.printf("%d년도는 윤년입니다", year);
		}
		else{
			System.out.printf("%d년도는 평년입니다",year);
		}
		
		
	}//end main
	
}//end class
