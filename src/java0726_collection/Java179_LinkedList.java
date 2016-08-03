package java0726_collection;

import java.util.LinkedList;

/*
 * 배열구조로 데이터 관리 : Vector, ArrayList - 추가-(순차적으로 처리할때 사용한다.)
 * 링크로 데이터 관리 : LinkedList-삽입, 삭제 -(비순차적으로 처리할때 사용한다.) 
 * -> 따라서 삽입 삭제시 처리 속도가 빠르다, 메모리공간에 값과 주소2개를 저장할 총 3개의 공간이 있는 것만 찾으면 된다
 * 
 * 리스트를 구현해 놓은 컬렉션
 * Vector, ArrayList, LinkedList은 add()해준 순서대로 인덱스가 제공이 된다.
 */


public class Java179_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nList=new LinkedList<String>();
		//추가
		nList.add(new String("java"));
		nList.add(new String("jsp"));
		nList.add(new String("spring"));
		
		//삽입
		nList.add(1, new String("ajax"));
		
		//삭제
		nList.remove(2);
		
		for(int i=0; i<nList.size(); i++){
			System.out.println(nList.get(i));
		} 
		
		for(String sn:nList){
			System.out.println(sn);
		}
		
		
	}//end main
	
}//end class
