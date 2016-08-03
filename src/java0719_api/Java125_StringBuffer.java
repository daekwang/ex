package java0719_api;

/*
 * java.lang.String: 불변
 * java.lang.StringBuffer: 가변, 비동기화
 * java.lang.StringBuilder: 가변, 동기화
 */

public class Java125_StringBuffer {

	public static void main(String[] args) {
		String sg=new String("java test");
		String ss=sg.replace("java", "jsp");
		//StringBuffer는 메모리에 저장된 데이터를 변경해준다
		//String에서는 할 수 없었다
		System.out.println(sg); //변경 안됨
		System.out.println(ss); //변경 됨
		
		System.out.println("/////////////////////////////");
		StringBuffer sb=new StringBuffer("spring test");
		sb.replace(0, 6, "framework");
		System.out.println(sb);
		
		
	}//end main
	
}//end class
