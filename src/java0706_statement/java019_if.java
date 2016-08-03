package java0706_statement;
/*
 * if(조건식){
 *    if(조건식){
 *     수행할 문장; }
 *    
 *    else{
 *      수행할 문장;
 *    }
 *   }
 * else{
 *    수행할 문장;}
 */
public class java019_if {

	public static void main(String[] args) {
		boolean member= true;
		String grade="일반";//회원일때 등급
		if(member){
			//논리값을 입력받으니 자동으로 false인지 true인지 구분이가능하기때문에 member==true 를 특별히 써주지 않아도 된다.
			if(grade=="vvip"){System.out.println("30%적립이 가능합니다.");
			}else{System.out.println("10%접립이 가능합니다.");}
			
		}else{
			System.out.println("비회원입니다.");
			
		}
	   System.out.println("고객님 감사합니다.");
		
	}//end main()

}//end class()
