package java0704_basic;
//주석: 코드에 대한 설명을 의미한다

//한 라인에 대한 주석처리
/*
 * 여러 라인에 대한 주석처리
 */

/*
 * 자바에서 제공하는 데이터타입
 * 1. 기본데이터 타입
 * 	숫자:정수=> byte(1byte), short(2byte), int(4byte), long(8byte) 정수의 기본은 int
 *   	실수 => float(4byte), double(8byte) 실수의 기본은 double
 * 	문자:char(2byte)
 * 	논리:boolean(1byte)
 * 2. 참조데이터 타입
 * 	배열, 클래스, 인터페이스
 * 
 * 시스템에서 인식하는 데이터 타입의 크기  
 * : byte < short, char < int < long < float < double 
 */

public class Java003_dataType {

	public static void main(String[] args) {
		//변수 : 하나의 값을 저장하기 위한 메모리 공간
		int num=10;
		
		//data변수에 저장할 수 있는 값의 데이터 타입은 int 이므로
		//double타입인 3.5은 data변수에 저장할 수 없다
		//int data=3.5;
		
		// -128 ~ 127까지 byte에 저장할 수 있다
		//byte, short는 자동 형반환을 해준다
		byte check=127;
		//-32768 ~ 32767까지 short에 저장할 수 있다
		short kt=127;
		int kn=127;
		
		//long 타입의 값은 대문자 L로 지정해주어야 한다(Casting)
		long ko=43L;
		//float 타입의 값은 대문자 F로 지정해주어야 한다(실수는 원래 기본형이 double이기 때문임)
		float avg=4.5F;
		double sum=9.3;
		
		char alpa='a';
		boolean is=true;
		is=false;
		
		
		
	}

}
