package java0719_api;

public class Java127_StringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("java test");
		//StringBuffer -> String 타입변경
		String sn=sb.toString();
		//String -> char[] 타입변경
		display(sn.toCharArray());
		
	}//end main
	
	public static void display(char[] data){
		for(char cn: data){
			System.out.print(cn);
		}
		
	}//end display
	
}//end class
