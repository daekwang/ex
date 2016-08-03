package java0719_api;

import java.util.StringTokenizer;

public class Java128_StringTokenizer {

	public static void main(String[] args) {
		//StringTokenizer(문자열,구분자)
		//구분자가 ','가 아닌 공백인 경우 두 번째 인자값은 생략해도 된다
		//구분자에 의해서 나눠진 문자열을 Token이라 한다
		//따라서 아래의 토큰은 2개이다
		String sp="java,jsp";
		StringTokenizer st=new StringTokenizer(sp, ",");
		System.out.println(st.countTokens());//2
		
		/*for(int i=0; i<st.countTokens(); i++){
			//nextToken은 메모리에 저장된 토큰을 완전히 꺼내온다
			//따라서 i=0 수행 후에, countTokens이 1이된다
			System.out.println(st.nextToken());
		}*/
		
		//메모리에 저장된 토큰을 가져올 수 있으면 true 아니면 false를 리턴한다
		//hasMoreTokens
		while(st.hasMoreTokens()){
			//메모리에 저장된 토큰을 가져온다
			System.out.println(st.nextToken());
		}
		
		
	}//end main
	
}//end class
