package java0718_api;

/*
 * [출력결과]
 * 홍길동님은 남성입니다.
 * 응삼이님은 여성입니다.
 * 
 */

public class Java117_String {

	public static void main(String[] args) {
		String p1="홍길동,561203-1597650	";
		String p2="응삼이,030628-4056892";
		display(p1);
		display(p2);
		
	}//end main
	
	public static void display(String str){
		//여기를 구현하세요
		String[] arr=str.split(",");
		/*String gender;
		if(arr[1].charAt(7)=='1'){
			gender="남성";
		}
		else{
			gender="여성";
		}
			System.out.printf("%s님은 %s입니다\n",arr[0],gender);
		*/
		char data=arr[1].charAt(7);
		if(data=='1'||data=='3'){
			System.out.printf("%s님은 남성입니다.\n",arr[0]	);
		}
		
		else if(data=='2'||data=='4'){
			System.out.printf("%s님은 여성입니다.\n",arr[0]);
		}
		else{
			System.out.println("잘못입력하셨습니다");
		}
		
	
		
		
	}
	
}//end class
