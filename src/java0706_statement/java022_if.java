package java0706_statement;
/*각 월의 마지막일
 * 1 3 5 7 8 10 12 => 31
 * 4 6 9 11 => 30
 * 2 => 28
 * 
 * [출력결과]
 * 4월의 마지막 일은 30일입니다.
 */

public class java022_if {

	public static void main(String[] args) {
		int month=2;//월
		int lastDay=-1;//월의 마지막일
		
		if(month==2){
			lastDay=28;
			System.out.printf("%d월의 마지막일은 %d입니다.\n",month,lastDay);
		}else if(month==4||month==6||month==9||month==11){
			lastDay=30;
			System.out.printf("%d월의 마지막 일은 %d입니다.\n",month,lastDay);
		}else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			lastDay=31;
			System.out.printf("%d월의 마지막 일은 %d입니다.\n",month,lastDay);
		}
		if(lastDay==-1){
			//if(!(1<=month&&month<=12))
		System.out.println("잘못입력했습니다.다시 시작하세요");
		}
	}//end main()

}//end class()

