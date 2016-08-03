package java0705_basic_operator;
/*
 * 형변환(casting)
 * 1 값의 타입을 다른타입으로 변환하는 것이다.
 * 2  묵시적형변환
 *     작은 값의 데이터 타입을 큰 값의 데이터 타입으로 변환할때 발생한다.
 *     int num;
 *     short data=50;
 *     num=data;
 *     
 *    명시적형변환
 *    큰 값의 데이터 타입을 작은 값의 데이터 타입으로 변화할때 발생한다.
 *    double paran=10.5;
 *    num=(int)paran;
 */


public class Java005_casting {

	public static void main(String[] args) {
		int numX=5;
		
		//int 타입의 데이터가 double로 자동형변환이 이루어짐(원래는 캐스팅 타입을 명시해야 함)
		//작은 데이터 타입의 값을 큰 값의 데이터 타입으로 형변환 할 때 '묵시적 형변환'이 이루어짐
		double res=numX;
		System.out.println("res: "+res);
		
		//'명시적 형변환', 큰 데이터 타입을 작은 데이터 타입으로 형변환 할 때
		short pa=(short)numX;
		System.out.println("pa: "+pa);
		
	}//end main() -> 끝나는 곳 주석처리 습관화 하자
	
}//end class
