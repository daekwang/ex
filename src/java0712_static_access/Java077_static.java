package java0712_static_access;

class OrderStatic{
	static{//main메소드 호출되기 전에 static이 처리된다
		System.out.println("static");
	}
	
	public OrderStatic() {
		System.out.println("constructor");
	}
	
	public void prn(){
		System.out.println("prn");
	}
	
}//end class

public class Java077_static {

	public static void main(String[] args) {
		OrderStatic ss=new OrderStatic();
		ss.prn();
		
	}//end main()

}//end class
