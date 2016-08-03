package java0714_inheritance;

class SuperConst{
	int x;
	int y;
	//public SuperConst() {}
	
	public SuperConst(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.printf("x=%d y=%d",x,y);//이 때 x,y는 매개변수 값을 받아옴. why?지역변수가 우선순위가 높기 때문
	}
	
}//end SuperConst

class SubConst extends SuperConst{
		
	SubConst() { //기본생성자의 접근제어자는 클래스의 접근제어자를 따른다
		super(10, 20);//반드시 부모클래스의 생성자를 먼저 처리해주어야 한다
	}
}

public class Java088_inheritance {

	public static void main(String[] args) {
		SubConst sc=new SubConst(); 
		
	}//end main()
	
}//end class
