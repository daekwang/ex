package java0721_exception_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Java156_stream {

	public static void main(String[] args) {
		//바이트 스트림
		InputStream is=System.in;
		
		//바이트 스트림과 문자 스트림 연결
		InputStreamReader ir=new InputStreamReader(is);
		
		//문자스트림
		BufferedReader br=new BufferedReader(ir);
		//-> 이 세가지를 한 번에 묶어놓은 클래스가 Scanner이다
		
		int x=0;
		int y=0;
		
		try {
			System.out.print("x: ");
			x=Integer.parseInt(br.readLine());
			System.out.print("y: ");
			y=Integer.parseInt(br.readLine());
			System.out.printf("x+y=%d\n",x+y);
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}//end main
	
}//end class
