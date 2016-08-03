package java0706_statement;

public class java029_for {
	

	public static void main(String[] args) {
		int sum=0;
		//아래에서 호출해할때 사용하려면 for문밖에다 선언해준다. 
		int i;
		//for문에서 조건식을 생략할때는 종료되는 값을 정확히 모를때 생략한다.
		for(i=1; ;i++){
			sum+=i;
			if(sum>=30)
				break;//현재 수행중인 반복문을 빠져나온다.
			
		}
		System.out.println("i의 값은"+i);
		System.out.println("sum의 값은"+sum);
		
		
	}//end main()

}//end class()
