package java0722_stream_collection;

import java.io.File;

public class java164_stream {

	public static void main(String[] args) {
		File file=new File("./src/java0722_stream_collection/temp");
		//temp폴더가 존재하지 않으면
		if(!file.isDirectory()){
			//mkdir은 폴더를 하나 생성할때,
			//mkdirs는 폴더를 여러 개 생성할때 사용
			//temp폴더를 생성한다
			file.mkdirs();
			System.out.println("폴더 생성");
		}else{
			System.out.println("폴더 존재");
		}
		
		file=new File("./src/java0722_stream_collection/sample.txt");
			if(file.exists()){
				file.delete();
			}
		
	}//end main
	
}//end class
