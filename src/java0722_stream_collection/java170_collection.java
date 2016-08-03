package java0722_stream_collection;

import java.util.Vector;

/*
 * 컬렉션 클래스를 선언하고 생성할 때 제너릭을 선언한다. 
 * 제너릭(generic):클렉션 클래스에 저장된 객체를 가져올때
 * 다운캐스팅하는 작업을 생략할 수 있도록 제공해주는 기능이다.
 */

public class java170_collection {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>(); // <> 이 안에 다운캐스팅 할 타입을 명시해준다 -> 이것을 '제너릭'이라 한다
		v.addElement(new Integer(100));//0
		v.addElement(new Integer(200));//1
		
		//이처럼 제너릭을 쓰게 되면 별도로 다운캐스팅을 해주지 않아도 된다
		Integer t1=v.get(0);
		System.out.println(t1);
		Integer t2=v.get(1);
		System.out.println(t2);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡ일반 반복문ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for(int i=0; i<v.size(); i++){
			System.out.println(v.get(i));
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡ개선된 반복문ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		//for(데이터타입 변수: 배열, 컬렉션){}
		for(Integer it: v){
			System.out.println(it);
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Vector<Number> vt=new Vector<Number>();
		vt.addElement(new Integer(10));
		vt.addElement(new Double(10.4));
		vt.addElement(new Float(4.8f));
		
		for(Object nb: vt){
			System.out.println(nb);
		}
		
		
	}//end main
	
}//end class
