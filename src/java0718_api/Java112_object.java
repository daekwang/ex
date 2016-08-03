package java0718_api;

/* 
 * JAVA API(Application Programming Interface)
 * Object
 * 1 클래스 중에서 최상의 클래스이다.
 * 2 Object을 제외한 모든 클래스들은 Object을 상속받고 있다.
 * 3 java.lang패키지에서 제공하는 클래스이다.(java.lang패키지에 있는 클래스들은 별도로 import 안해도 된다)
 */

public class Java112_object {
	
	public static void main(String[] args) {
		Object obj=new Object();
		//java.lang.Object@15db9742
		//객체타입@해쉬코드값
		System.out.println(obj.toString());
		
		int x=5;
		int y=5;
		
		//==연산자 값비교(기본데이터)
		System.out.printf("x=%d y=%d x==y:%b\n",x,y,x==y);
		
		Object ojt=new Object();
		//==연산자 주소비교(참조데이터)
		System.out.printf("obj==ojt:%b\n",obj==ojt);
		
		//.equals() 주소비교,객체비교에만 사용
		System.out.printf("obj.equals(ojt)=%b\n",obj.equals(ojt));
		
		//.getClass -> 객체의 클래스 타입을 제공해준다
		System.out.println(obj.getClass());
		
		//.getClass().getName() -> 객체의 이름만 가지고 온다
		System.out.println(obj.getClass().getName());
		
		System.out.println(obj);
		System.out.println(obj.toString());
		
	}//end main
	
}//end class
