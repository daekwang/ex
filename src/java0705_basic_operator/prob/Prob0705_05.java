package java0705_basic_operator.prob;

/*
 * 동전교환프로그램
 * 1 가장적은 동전으로 교환할 수 있는 프로그램작성하시오
 * 2 [출력결과]
 *   500원: 15개
     100원: 2개
     50원: 1개
     10원: 2개
     1원: 7개
 */

public class Prob0705_05 {

	public static void main(String[] args) {
		int money = 7777;
		int mok=money/500;
		
		int res=money-mok*500;
		int mok2=res/100;
		
		int res2=res-mok2*100;
		int mok3=res2/50;
		
		int res3=res2-mok3*50;
		int mok4=res3/10;
		
		int res4=res3-mok4*10;
		int mok5=res4/1;
	
		//여기에 작성하시오
		System.out.println("500원: "+mok+"개");
		System.out.println("100원: "+mok2+"개");
		System.out.println("50원: "+mok3+"개");
		System.out.println("10원: "+mok4+"개");
		System.out.println("1원: "+mok5+"개");
		
		/*
		 printf("500원:%d개\n", mok);
		 
		 money=money%500;
		 mok=money/100;
		 printf("100원:%d\n", mok);
		 
		 money=money%100;
		 mok=money/50;
		 printf("50원:%d\n", mok);
		 
		 money=money%50;
		 mok=money/10;
		 printf("10원:%d\n", mok);
		 
		 money=money%10;
		 printf("1원:%d\n", money);
		 
		 */
	}//end main()

}//end class



