package java0718_api;

public class Java114_String {
	
	public static void main(String[] args) {
		String sn="java";
		String sg="java";
		String st=new String("java");
		String ss=new String("java");
		
		//== 주소비교(객체비교)
		//new로 객체 생성시 무조건 heap영역 메모리에 값을 할당한다 
		System.out.printf("sn==sg:%b\n",sn==sg);
		System.out.printf("st==ss:%b\n",st==ss);
		
		//.equals(): 메모리에 저장된 문자열을 비교한다
		//따라서, 각 변수마다 java라는 문자열이 저장되어 있기 때문에 true이다 
		System.out.printf("sn.equals(sg):%b\n", sn.equals(sg));
		System.out.printf("st.equals(ss):%b\n", st.equals(ss));
		
		//toString(): 메모리에 저장된 문자열을 리턴
		System.out.println(sn.toString());
		System.out.println(sn);
		

	}
}
