package java0722_stream_collection;

import java.util.Vector;

public class java169_collection {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		//Integer -> Object로 업캐스팅되서 저장이됨(컬렉션에 저장되는 것은 모두 object로 저장)
		v.addElement(new Integer(10));//컬렉션에 저장하는 값은 모두 '객체'이다, 인덱스 0
		v.addElement(new Integer(20));//인덱스 1
		v.addElement(new Integer(30));//인덱스 2
		
		//Object -> Integer(다운캐스팅)
		Integer it=(Integer)v.get(0);//원래는 object로 리턴, 따라서 다운캐스팅 해줘야된다
		System.out.println(it);
		
		
		//int -> Integer ->Object : 즉,  auto boxing -> upcasting이 일어남
		v.addElement(40);
		
		//Object -> Integer ->int : 즉, downcasting -> auto unboxing이 일어남
		int data=(Integer)v.get(3);
		System.out.println(data);

		
		
		
		
		
	}//end main
	
}//end class
