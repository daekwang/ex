package java0721_exception_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Java150_exception {

	public static void main(String[] args) {
		File file=new File("sample.txt");
		try {
			FileReader fr=new FileReader(file);
			//FileNotFoundException은 checked exception이므르ㅗ
			//반드시 try~catch 예외처리를 해줘야 한다
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}//end main
	
}//end class
