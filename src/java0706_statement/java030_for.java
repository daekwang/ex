package java0706_statement;
/*
 * i=1 sum=1
 * i=2 sum=3
 * .
 * .
 * .
 * i=8 sum=36
 */
public class java030_for {

	public static void main(String[] args) {
		
		int sum=0;
		//아래에서 호출해할때 사용하려면 for문밖에다 선언해준다. 
		int i;
		//for문에서 조건식을 생략할때는 종료되는 값을 정확히 모를때 생략한다.
		for(i=1; i<=8;i++){
			sum+=i;
			System.out.printf("i=%d sum=%d\n",i,sum);
			/*if(sum>=30)
				break;//현재 수행중인 반복문을 빠져나온다.
			*/
		}
		

	}//end main()

}//end class()
