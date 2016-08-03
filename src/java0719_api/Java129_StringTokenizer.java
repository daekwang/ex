package java0719_api;

import java.util.StringTokenizer;

public interface Java129_StringTokenizer {

	public static void main(String[] args) {
		//구분자가 연속적으로 입력되어 있으면 두번째 구분자부터는 무시한다
		StringTokenizer st=new StringTokenizer("java,,jsp/spring",",/");
		System.out.println("countToken: "+st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		System.out.println("////////////////////");
		
		//split은 구분자 개수만큼 무조건 나눠준다
		//따라서 ,, 사이에 공백까지 나눈다
		String[] data="java,,jsp/spring".split("[,/]");
		System.out.println("countToken: "+data.length);
		for(String ss:data){
			System.out.println(ss);
		}
		
		
	}//end main
	
}//end class
