package java0714_inheritance;

class MyGrand{
	public MyGrand() {
		System.out.println("조상 생성자");
	}
	
}//end MyGrand

class MyFather extends MyGrand{
	public MyFather() {
		super();
		System.out.println("부모 생성자");
	}
	
}//end MyFather

class My extends MyFather{ //서브 클래스에서는 상위 클래스의 생성자를 반드시 호출해야한다
	//자식생성자에서는 반드시 부모생성자를 호출해야한다
	//부모생성자호출이 생략되어 있으면 JVM에서 super()로 호출한다
	//this.는 객체 자신 super는 메모리에 생성된 부모객체를 의미한다
	public My() {
		super();//상위 클래스의 생성자를 의미, 인자값이 없다면 생략할 수 있다
				//다른 것들을 처리하기 전에 super()를 가장 먼저 처리해야 한다
		System.out.println("자손 생성자");
	}
	
}//end My



public class Java087_inheritance {
	
	public static void main(String[] args) {
		My mm=new My();
		
		
	}//end main()
	
}//end class
