package java0721_exception_stream;

public class Java148_exception {

	public static void main(String[] args) {
		StringBuffer sb=null;
		try{//try영역을 나가면 다시 돌아오는 일은 없다
			sb.reverse();
			System.out.println(sb);
		}catch(NullPointerException e){
			sb=new StringBuffer("java");
			System.out.println(sb.reverse());
		}finally{
			System.out.println("program end");
		}
		
	}//end main
	
}//end class
