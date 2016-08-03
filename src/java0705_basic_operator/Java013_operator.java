package java0705_basic_operator;

public class Java013_operator {

	public static void main(String[] args) {
		int total=26;
		int record=5;
		
		//삼항연산자 : 식의 결과에 따라서 리턴해주는 값이 여러개일때 사용한다
		//삼항연산자 : 조건식? 참(true) : 거짓(false)
		int res = total%record==0? total/record : total/record+1;
		System.out.println(res);
		
		
		
	}//end main();
	
}//end class
