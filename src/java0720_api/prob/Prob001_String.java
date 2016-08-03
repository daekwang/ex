package java0720_api.prob;

/*
 * javac Prob001_String.java ->컴파일
 * java Prob001_String ->실행
 * args는
 * java Prob001_String JAva Test ->이런식으 값을 바로 넣어서 실행하는 것
 */

/*1 프로그램 실행할때  "JAva Test" 문자열을 args배열에서 값을 받아 출력결과에 같이
 *  나오도록 프로그램을 구현하시오.
 *  java Prob001_String JAva Test
 *   * 
 * 2 출력결과
 *   source : JAva Test 
 *   convert: jaVA tEST
 *   length: 9
 *   reverse : tseT avAJ
 */

public class Prob001_String {

	public static void main(String[] args) { 
		String source=args[0]+" "+args[1];
		System.out.println("source: "+source);
		
		char[] data=source.toCharArray();
		for(int i=0; i<data.length; i++){
			if(data[i]>='a' && data[i]<='z'){
				data[i]=Character.toUpperCase(data[i]);
			}
			else if(data[i]>='A' && data[i]<='Z')
				data[i]=Character.toLowerCase(data[i]);
		}
		System.out.println("convert: "+String.valueOf(data));
		
		System.out.println("length: "+source.length());
		
		StringBuffer sb=new StringBuffer(source);
		System.out.println("reverse: "+sb.reverse());
		
	}
		
}// end class

