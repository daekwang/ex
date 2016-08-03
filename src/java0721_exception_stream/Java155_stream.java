package java0721_exception_stream;

import java.io.IOException;
import java.io.InputStream;

/*
 * 키보드로 enter를 치게되면?
 * carriage return: 줄의 처음으로 이동(13) -> \r
 * line feed: 다음 줄로 이동(10) -> \n
 * 위의 2가지가 실행이 된다. 따라서 아래 while문을 엔터치는순간 빠져나온다
 * 
 */

public class Java155_stream {

	public static void main(String[] args) {
		InputStream is=System.in;
		System.out.print("이름: ");
		int data;
		
		try {
			while((data=is.read())!=13){
				System.out.println((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}//end main
	
}//end class
