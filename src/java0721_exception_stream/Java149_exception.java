package java0721_exception_stream;

public class Java149_exception {

	public static void main(String[] args) {
		String data1="12";
		String data2="0";
		
		try{
			int x=Integer.parseInt(data1);
			int y=Integer.parseInt(data2);
			int res=x/y;
			
		//다중 catch를 할 때는 하위 Exception을 먼저 써주고 상위 Exception을 나중에 써준다	
		}catch(NumberFormatException e){
			System.out.println("숫자를 입력하세요");
		}catch(ArithmeticException e){
			System.out.println("분모는 0보다 큰 수를 입력하세요");
		}catch(RuntimeException e){//예상치 못한 예외를 받기 위해서 RuntimeException사용
			System.out.println(e.toString());
		}
		
		
	}//end main
	
}//end class
