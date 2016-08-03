package java0708_method;
/*
 * [실행결과]
 * tset avaj
 */

public class Java058_method {
	static char[] arr={'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't'};
	
	public static void main(String[] args) {
		System.out.println(reverse(arr));//숫자가 저장되어 있는 배열은 이런식으로 표현못한다
		//System.out.println(process());   char일때만 출력 가능
		

	}//end main()
	
	public static int[] process(){
		return new int[]{1,2,3}; // -> 바로 호출못한다. why? 주소값만 나옴
	}

	public static char[] reverse(char[] data){
		//data의 요소 앞뒤를 바꿔서 리턴하는 프로그램을 구현하세요
		char[] num=new char[data.length];
		
		for(int i=0; i<num.length; i++){
			num[i]=data[data.length-1-i];
		}
		
		return num;
	}
	
}//end class
