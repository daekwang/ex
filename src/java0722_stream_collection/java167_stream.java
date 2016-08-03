package java0722_stream_collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class java167_stream {

	public static void main(String[] args) {
		File fs1=new File("./src/java0722_stream_collection/song.txt");
		File fs2=new File("./src/java0722_stream_collection/score.txt");
		
		try {
			FileInputStream fn1=new FileInputStream(fs1);
			FileInputStream fn2=new FileInputStream(fs2);
			
			//두 개의 입력스트림을 연결해서 하나의 스트림처럼 읽어온다
			SequenceInputStream ss=new SequenceInputStream(fn1, fn2);
			int data;
			while((data=ss.read())!=-1){
				System.out.print((char)data);
			}
			ss.close();
			fn2.close();
			fn1.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//end main
	
}//end class
