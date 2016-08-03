package java0726_collection;
/*
 * 큐(Queue)
 * 1 FIFO(First In First Out) : 제일 먼저 저장한 것을 제일 먼저 꺼내게 된다.
 * 2 최근사용문서, 인쇄작업대기목록,버퍼
 * 
 */

import java.util.LinkedList;

public class Java182_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nList=new LinkedList<String>();

		nList.offer(new String("java"));//메소드를 offer()로 주면 queue형식으로 저장이된다
		nList.offer(new String("jsp"));
		nList.offer(new String("spring"));
		
		while(!nList.isEmpty()){
			System.out.println(nList.poll());
		}
		
		
	}//end main
	
}//end class
