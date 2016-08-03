package java0705_basic_operator;
/*
 * 연산자(operator)
 * 어떠한 기능을 수행하는 기호(+,-, *,/,%, >, <,==, !=....)
 * 
 * 피연산자(operand)
 * 연산자의 작업 대상(변수, 상수, 리터널, 수식)
 * 
 * 연산자 종류
 * 1 산술연산자 : +,-, *, / ,%
 * 2 비교연산자 : >, <, >=, <=, !=, ==
 * 3 논리연산자 : &&(and), ||(or), !(not)
 * 4 삼항연산자(조건연산자) : 조건식?참:거짓 -> 조건식의 결과는 true 아니면 false
 * 5 대입연산자 : =, +=, -=, *=, /=....
 * 6 단항연산자 : ++(1씩증가),--(1씩감소)
 */

public class Java007_operator {

	public static void main(String[] args) {
		int numX=10;
		int numY=5;
		
		//같은 타입으로 연산하면 같은 타입으로 리턴이 된다.
		int res=numX+numY;
		
		short numA=3;
		short numB=5;
		//int데이터 타입 이하끼리 연산이 되면 무조건 결과는 int데이터 리턴 타입이다, 따라서 int로 받아야 한다
		int data=numA+numB;
		
		//다른 데이터 타입끼리 연산이 되면 결과 데이터 타입은 큰 데이터 타입을 따른다
		//short+int의 연산은 int 값으로 리턴 된다
		int pk=numA+numX;
		
		byte ma=2;
		//int데이터 이하의 데이터 타입의 연산의 결과 값은 무조건 int
		int pn=ma+numA;
		
	}//end main

}//end class
