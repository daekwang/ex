package java0721_exception_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java159_stream {

	public static void main(String[] args) {
		File file=new File("sample.txt");
		//System.out.println(file.exists());
		//System.out.println(file.isFile());
		//System.out.println(file.canWrite());
		FileWriter fw=null;
		try {
			/*
			 * FileWriter("대상파일",mode)
			 * mode의 값이 true이면 append 이고, false이면 update이다
			 * 생략하면 mode의 값은 false이다(기본값)
			 */
			
			fw=new FileWriter(file, false);
			fw.write("java\r\n");//write메소드는 바로 대상에 쓰지 않고 Buffer에다가 쓴다
			fw.flush();//buffer의 내용을 대상 file에 보내고 buffer를 클리어한다
			fw.write("test");
			
			System.out.println("저장종료");
			
			fw.write(97);
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}//end main

	
}//end class
