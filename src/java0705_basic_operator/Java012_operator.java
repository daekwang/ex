package java0705_basic_operator;

public class Java012_operator {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		int c=7;
		
		// &&연산자의 앞 피연산자가 false이면 뒤 피연산자를 수행하지 않는다
		// 그래서 b값이 5이다
		boolean res=(++a>b) && (++b<c);
		//%b -> b자리에 논리값, %d -> d자리에 숫자값(연산값)
		System.out.printf("res=%b, b=%d\n", res, b);
		
		int x=4;
		int y=8;
		int z=10;
		
		// ||연산자의 앞 피연산자가 true이면 뒤 피연산자를 수행하지 않는다
		// 그래서 x값이 4이다
		boolean res2=(z> ++y) || (++x >y);
		System.out.printf("res2=%b, x=%d\n", res2, x);
	
		

	}//end main()

}//end class
