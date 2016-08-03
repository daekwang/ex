package java0705_basic_operator;
/*
 * 자바에서 문자를 표현하기 위해 유니코드를 사용한다
 * '0' => 48
 * 'a' => 97
 * 'A' => 65
 * 대문자와 소문자의 유니코드 차이는 "32"
 */


public class Java006_casting {

	public static void main(String[] args) {
		//하나의 값을 나타낼 때 char를 사용한다
		//자바에서는 UNICODE를 사용한다(문자에 고유 숫자 값을 부여한 것)
		
		char data='a'; 
		int asc=data;
		System.out.println(asc);
		
		
		//data-32의 결과 리턴 데이터 타입은 int값이기 때문에 char로 형 변환 시켜준다
		char alpaUpper=(char)(data-32);
		System.out.println(alpaUpper);
		
		short num=128;
		//명시적 형변환시 byte가 담을 수 있는 값만 형변환을 해준다(즉, 값의 범위에 주의한다)
		byte one=(byte)num;
		System.out.println(one);
		
		
	}//end main
	
}//end class
