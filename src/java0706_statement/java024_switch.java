package java0706_statement;
/*
 * switch(식){
 *   case 값1 : 문장1; break;
 *   여기에서 break를 빼면 다음 case 2 의 문장을 실행시킨다.
 *   case 값2 : 문장2; break;
 *   case 값3 : 문장3; break;
 *   default : 문장4;
 * }
 * 
 * 식의 결과리턴타입 : byte, short, int,  char, enum(7버전부터),String(7버전부터)
 * 
 * switch~case에서 break을 만나면 현재 수행중인 조건문을 완전히 빠져나와
 *   다음문장을 수행한다.
 */
public class java024_switch {

	public static void main(String[] args) {
		 int jumsu=100;
		 char res;
		 
		 switch(jumsu/10){
		 case 10: 
			// res='A';
			// break;
		 case 9: 
			 res='A';
			 break;
		 case 8:
			 res='B';
			 break;
		 case 7: 
			 res='C';
			 break;
		 case 6:
			 res='D';
			 break;
		 default : 
			 res = 'F';
		 }
		 System.out.println("당신의 성적은?"+res);
		 

	}//end main()

}//end class()
