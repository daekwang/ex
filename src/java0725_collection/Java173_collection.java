package java0725_collection;

import java.util.Vector;

public class Java173_collection {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>(); //컬렉션에 저장되는 것은 모두 '객체'이므로 object로 저장된다
		v.add(new Integer(10));//순차적으로 삽입
		v.add(new Integer(20));
		v.add(new Integer(30));
		
		//1인덱스의 요소가 제거된다
		v.remove(1);
		
		for(Integer it:v){
			System.out.println(it);
		}
		
		//0인덱스에 40요소를 삽입한다
		v.add(0, new Integer(40));
		
		
		
	}//end main
	
}//end class
