package java0705_basic_operator;
/*
 *  변수 : 하나의 값을 저장하기 위한 공간
 *  상수 : 한 번만 값을 저장할 수 있는 공간
 *  리터널 : 그 자체로 값을 의미 
 */

public class Java004_value {

	public static void main(String[] args) {
		int data=10; // 10자체를 리터널이라고 한다
		final int NUM=20; // NUM에 저장된 값을 상수로 사용하겠다(즉, NUM값은 언제나 20이다), 여기서 상수 NUM을 대문자로 쓰는 것은 '관례'이다
		data=50;
		//상수에는 새로운 값을 할당할 수 없다
		//NUM=60;
		

	}

}
