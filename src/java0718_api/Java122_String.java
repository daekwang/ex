package java0718_api;

/*
 * 정규식(Regular Expression)
 * 1 정규식이란 텍스트 테이터 중에서 원하는 조건(패턴)과 일치하는 문장열을 
 *   찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서 작성한
 *   문자열을 말한다.
 * 
 */

public class Java122_String {

	public static void main(String[] args) {
		String sn="java korea";
		String sg="";
		String st="java     korea";
		
		//sn변수에 저장된 문자열에서 'a' or 'r'이면 '_'로 변경해서 
		//sg변수에 저장하고 나머지는 그대로 사용한다
		
		for(int i=0; i<sn.length(); i++){
			if(sn.charAt(i)=='a' || sn.charAt(i)=='r'){
				sg+='_';
			}
			else{
				sg+=sn.charAt(i);
			}
		}
		System.out.println(sg);
		
		System.out.println("regular expression을 이용한 문자변경");
		//[]대괄호는 or를 의미한다
		//sn변수에 저장된 문자열에서 a이거나 r이면 "_"로 변경한다
		System.out.println(sn.replaceAll("[ar]", "_"));
		//임의의 문자(a이거나 r로 끝나면 boolean값 반환)
		//sn변수에 저장된 문자열에서 a이거나 r이 포함되면 true, 아니면 false값 반환(".*[ar].*")
		System.out.println(sn.matches(".*[ar].*"));
		// \\s->공백을 의미, 즉 \\s{2,3}은 공백이 2개나 3개이면 공백을 "@"으로 바꾸라는 것을 의미한다
		// {2,3} 2개부터 3개 까지의 공백을 "@"으로 변경한다
		// 자바에서 \는 특수문자를 사용할 때 씀. 따라서 공백을 사용하려면 \을 두번 \\해야함
		System.out.println(st.replaceAll("\\s{2,3}", "@"));
		
		
	}//end main
	
}//end class
