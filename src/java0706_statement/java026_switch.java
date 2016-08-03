package java0706_statement;
/*각 월의 마지막일
 * 1 3 5 7 8 10 12 => 31
 * 4 6 9 11 => 30
 * 2 => 28
 * 
 * [출력결과]
 * 4월의 마지막 일은 30일입니다.
 */
public class java026_switch {

	public static void main(String[] args) {
		int month=7;
		int lastDay=-1;
		
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: 
			lastDay=31; 
			//System.out.printf("%d월의 마지막 일은 %d일입니다.\n",month,lastDay);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay=30;
			break;
		case 2:
			lastDay=28;
			break;
			default: break;			
		}
		
		if(lastDay==-1){
			//if(!(1<=month&&month<=12))
		System.out.println("잘못입력했습니다.다시 시작하세요");
		}else{
			System.out.printf("%d월의 마지막 일은 %d일입니다.\n",month,lastDay);
		}

	}//end main()

}//end class()
