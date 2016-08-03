package java0722_stream_collection;

import java.util.Vector;

/*
 * 배열: length
 * 문자열: length()
 * 컬렉션: size()
 */

public class java172_collection {

	public static void main(String[] args) {
		//Vector 생성자에 인자값이 없으면 용량의 기본값은 10이다
		Vector<String> v=new Vector<String>();
		v.addElement(new String("java"));
		
		
		//Vector생성자 인자값이 하나이면 최초 생성될 용량의 값이다
		//용량의 증가는 2배이다
		v=new Vector<String>(2);
		v.addElement(new String("seoul"));//용량 2
		v.addElement(new String("busan"));//용량 2 
		v.addElement(new String("incheon"));//용량 4
		v.addElement(new String("daegu"));//용량 4
		v.addElement(new String("ulsan"));//용량 8
		
		//Vector 생성자의 첫번째 인자값은 최초로 생성되는 용량의 값이고
		//두번째 인자값은 증가되는 값이다
		v=new Vector<String>(2,1);//기본 용량은 2이고 용량이 추가 될 때 1개씩 추가 된다는 것이다
		v.addElement(new String("홍길동"));//용량 2
		v.addElement(new String("영순이"));//용량 2
		v.addElement(new String("갑돌이"));//용량 3
		
		v=new Vector<String>();
		v.addElement(new String("apple"));
		v.trimToSize();//남는 메모리를 제거해준다, 용량 10 -> 용량 1
		
		
		//capacity() ->백터의 용량 리턴(메모리에 요소를 저장할 수 있는 크기)
		//size() -> 백터에 실제 저장된 요소 개수
		System.out.println("용량: "+v.capacity());
		System.out.println("크기: "+v.size());
		
		
	}//end main
	
}//end class
