package java0719_api;

public class Java139_Wrapper {

	public static void main(String[] args) {
		char data='d';
		
		//대문자로 바꾸기
		System.out.println(Character.toUpperCase(data));
		
		//현재 데이터 값이 소문자이냐?
		System.out.println(Character.isLowerCase(data));
		
		//현재 데이터 값이 숫자이냐?
		System.out.println(Character.isDigit(data));
		
		//현재 데이터 값이 알파벳이냐?
		System.out.println(Character.isAlphabetic(data));
		
		
		
	}//end main
	
}//end class
