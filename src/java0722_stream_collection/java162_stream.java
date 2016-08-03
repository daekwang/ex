package java0722_stream_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class java162_stream {

	public static void main(String[] args) {
		File file=new File("./src/java0722_stream_collection/score.txt");
		RandomAccessFile raf=null;
		try {
			//"r" : 읽기(read)만 가능하다
			//"rw" : 읽기(read)와 쓰기(write)가 가능하다
			raf=new RandomAccessFile(file, "r");
			System.out.println(raf.getFilePointer());//0
			System.out.println((char)raf.read());//k
			System.out.println(raf.getFilePointer());//1
			System.out.println(raf.readLine());//im:56/78/12, k다음에 있는 것부터 읽어옴
			String line=raf.readLine();
			System.out.printf("%s %d\n", line,line.length());
			System.out.println(raf.getFilePointer());//현재 포인터 위치, 30
			//포인터의 위치를 변경한다 (파일 처음부터 포인터를 찾는다)
			raf.seek(4);
			System.out.println(raf.readLine());
			//지정된 수 만큼 byte를 건너뛴다(현재 포인터가 있는 위치를 기준으로 건너뛴다)
			raf.skipBytes(2);
			System.out.println(raf.readLine());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
		
		
	}//end main
	
}//end class
