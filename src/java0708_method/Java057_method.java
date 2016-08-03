package java0708_method;

public class Java057_method {
	/*
	 * year변수에 값이 윤년이면 true, 평년이면 false를 반환하는 프로그램을 구현하시오
	 */
	public static void main(String[] args) {
		int year=2012;
		
		if(isLeapYear(year)){
			System.out.printf("%d년은 윤년입니다", year);
		}
		else{
			System.out.printf("%d년은 평년입니다", year);
		}
	}//end main

	public static boolean isLeapYear(int year){
		//구현
		
		if(year%4==0 && year%100!=0 || year%400==0){
			return true;
		}
		else{
			return false;
		}
	}
	
}
