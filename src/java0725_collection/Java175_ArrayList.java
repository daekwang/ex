package java0725_collection;

import java.util.ArrayList;

/*
 * Vector와 ArrayList
 * 1 Vector은 동기화 처리가 되여 있고 ArrayList은 비동기화 처리한다.
 * 2 Vector와 ArrayList은 메모리에 요소를 처리할때 배열의 구조를 따른다.
 * 3 Vector와 ArrayList의 클래스는 처리방법이 비슷하다.
 * 4 Vector와 ArrayList으로 요소의  추가,삭제를 처리하는 것은
 *    좋은 방법이 아니다. why? 배열의 구조 때문에! 삽입할 때는 값을 뒤로 하나씩 밀고 삭제할때는 값을 앞으로 하나씩 당긴다.
 *    그렇기 때문에 시간이 오래걸리므로 요소로 추가, 삭제를 처리하는 것은 좋은 방법이 아니다. 
 * 5. 배열은 순차적으로 값을 처리할때, 링크는 비순차적으로 처리할 때 좋다(즉, 삽입 삭제 시 좋다)
 * 6. 배열구조로 되어 있는 것이 Vector, ArrayList
 * 7. 링크로 되어 있는 것이 LinkedList
 */


public class Java175_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> aList=new ArrayList<Integer>();
		aList.add(new Integer(10));
		aList.add(new Integer(20));
		aList.add(new Integer(30));
		
		for(int i=0; i<aList.size(); i++){
			System.out.println(aList.get(i));//get은 해당하는 인덱스의 값을 복사해서 가져오는 것이다
		}
		
	}//end main
	
}//end class
