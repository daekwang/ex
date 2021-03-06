package java0726_collection;

import java.util.LinkedList;

/*
 * stack(스택)
 * 1. LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼내온다.
 * 2. 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로
 */


public class Java181_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nList=new LinkedList<String>();

		nList.push(new String("java"));//메소드를 push()로 주면 stack형식으로 저장이된다
		nList.push(new String("jsp"));
		nList.push(new String("spring"));
		
		while(!nList.isEmpty()){
			System.out.println(nList.pop());
		}
		
	}//end main
	
}//end class
