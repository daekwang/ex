package java0718_api;

public class Java115_String {

	public static void main(String[] args) {
		String str=new String("koREa,jsp,java");
		//String에서 문자열의 길이를 리턴해주는 것은 length()메소드이다(키워드x)
		System.out.println("문자열 길이: "+str.length());
		//모든 문자열을 대문자로 바꾸는 메소드-> toUpperCase()
		//모든 문자열을 소문자로 바꾸는 메소드-> toLowerCase()
		System.out.println("대문자: "+str.toUpperCase());
		System.out.println("소문자: "+str.toLowerCase());
		System.out.println("문자: "+str.charAt(1));//o
		System.out.println("인덱스: "+str.indexOf('R'));//2
		System.out.println("범위: "+str.substring(5));//,jsp,java
		System.out.println("범위: "+str.substring(2, 8));//REa,js
		
		String[] arr=str.split(",");
		for(int i=0; i<arr.length; i++){
			System.out.printf("arr[%d]=%s\n",i,arr[i]);
		}
		
		int x=10;
		int y=20;
		System.out.printf("%d+%d=%d\n",x,y,x+y);
		
		//valueOf->static이 선언, 따라서 바로 가져올 수 있다
		//valueOf->int(+기타등등)타입 값을 String으로 가져옴
		String s1=String.valueOf(x);
		String s2=String.valueOf(y);
		System.out.printf("%s+%s=%s\n",s1,s2,s1+s2);
		
		char[] data={'1','2','3'};
		String s3=String.valueOf(data);
		System.out.println(s3);
		
		
		
	}//end main
	
}//end class
