package java0721_exception_stream;

public class Java147_exception {

	public static void main(String[] args) {
		int[] arr=new int[3];
		
		try{//예외가 발생될 가능성이 있는 문장을 try로 묶어준다
			arr[4]=10;
			//문법적으로는 이상없기 때문에 컴파일 단계에서는 이상이 없지만 실행하면서 '예외'가 발생한다
			System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException ex){//'예외'가 발생 되면 객체를 받아 정상적으로 처리할 수 있도록 catch영역에 써준다
			//예외 정보
			//System.out.println(ex.getMessage()); -> 4
			//System.out.println(ex.toString()); ->java.lang.ArrayIndexOutOfBoundsException: 4
			ex.printStackTrace();// -> 예외 경로를 보여줌, at java0721_exception_stream.Java147_exception.main(Java147_exception.java:9)
			
		}finally{//finally는 '예외'발생 여부와 관계없이 무조건 수행한다
			System.out.println("program end");
		}
		
	}//end main
	
}//end class
