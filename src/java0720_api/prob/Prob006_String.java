package java0720_api.prob;

/*
 * [출력결과]
 *  영어 소문자 갯수:3
 *  영어 대문자 갯수:3
 *  숫자 갯수:2
 */

public class Prob006_String {

	public static void main(String[] args) {
		String data = "ke4RdTA5";

		display(process(data));
	}// end main()

	public static char[] process(String data) {
		char[] arr=data.toCharArray();
		
		return arr;
	}// end process()

	public static void display(char[] arr) {
		int lower=0;
		int upper=0;
		int number=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>='a' && arr[i]<='z'){
				lower++;
			}
			else if(arr[i]>='A' && arr[i]<='Z'){
				upper++;
			}
			else number++;
		}
		System.out.println("영어 소문자 갯수: "+lower);
		System.out.println("영어 대문자 갯수: "+upper);
		System.out.println("숫자 갯수: "+number);
		
		
	}// end display()

}// end class
