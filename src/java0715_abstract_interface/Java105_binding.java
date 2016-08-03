package java0715_abstract_interface;

class BindTest{
	String stn;
	
	public BindTest(String stn) {
		this.stn=stn;
	}
	
	public String toString(){
		return stn;
	}
	
}//end BindTest



public class Java105_binding {

	public static void main(String[] args) {
		//바인딩(binding): 두 개의 관계를 연결한 것이다
		//정적 바인딩: 메모리에 생성된 영역과 같은 타입으로 메모리를 관리한다
		BindTest bt=new BindTest("java");
		System.out.println(bt.toString());
		
		//동적 바인딩: 메모리에 생성된 영역을 부모객체로 메모리를 관리한다
		//상속(is a) -> 업캐스팅(Upcating) 발생 -> 동적바인딩
		//업캐스팅-> 부모객체변수에 자식객체변수 주소 값을 넣는것
		//다운캐스팅->자식객체변수에 부모객체변수의 주소값을 넣는것(이때 필요한 것이 명시적 형변환이다)
		
		Object obj=new Object();
		String st=new String("jsp");
		
		st=(String)obj;
		System.out.println(st.toString());
		
	}//end main
	
}//end class
