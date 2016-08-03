package java0707_statement;
/*
 * 기본데이터 타입은 스택에 저장, 참조데이터 타입은 heap에 저장
 * 배열에는 '주소값'만 저장된다
 * 배열은 같은 데이터 타입을 가진 것들을 하나로 관리 하기 위하여 사용한다
 * 참조데이터 타입은 'new'라는 키워드를 사용함으로써 만들어진다
 * 즉, new는 객체를 생성하기 위한 키워드다
 */
public class Java039_array {

	public static void main(String[] args) {
		/*int ko=90;
		int en=80;
		int jp=40;*/
		
		int jumsu[] = new int[3];
		/*
		 * new: 힙메모리에 배열을 생성해주는 키워드
		 * 배열에 저장된 값을 요소(element)라 한다
		 * 배열은 생성될때 요소에 접근할 수 있도록 인덱스가 제공된다
		 * (인덱스는 0부터 시작한다)
		 * 
		 * 배열의 크기를 리턴해주는 키워드는 length이다
		 * 키워드는 소괄호()가 없고 메소드는 소괄호()가 있다
		 * 
		 */
		for(int i=0; i<jumsu.length; i++){
			System.out.printf("jumsu[%d]=%d\n",i,jumsu[i]);
		}
		jumsu[0]=90;
		jumsu[1]=80;
		jumsu[2]=40;
		
		for(int i=0; i<jumsu.length; i++){
			System.out.printf("jumsu[%d]=%d\n",i,jumsu[i]);
		}
		
		String data="java";
		System.out.println("문자열길이"+data.length());

	}//end main()

}//end class
