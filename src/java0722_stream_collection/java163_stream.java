package java0722_stream_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class java163_stream {

	public static void main(String[] args) {
		File file=new File("./src/java0722_stream_collection/score.txt");
		RandomAccessFile raf=null;
		try {
			raf=new RandomAccessFile(file, "rw");
			//파일의 끝으로 포인터 위치를 변경한다
			raf.seek(raf.length());
			String stn=new String("Maron 5- DayLight, Sunday Morning\r\n");
			raf.writeBytes(stn); //string값 넣으려면 witeBytes
			raf.writeChar(97);//'a', 2byte로 처리하기 때문에 앞에 공백이 생겨남
			raf.writeBytes("\r\n");
			System.out.println("program end");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}//end main
	
}//end class
