package java0711_class;
/*
 * 클래스에서 정의하는 변수 종류
 * 멤버변수 : 멤버변수는 초기값을 할당하지 않으면 JVM(자바가상머신)에서 
 *          기본값을 할당한다.
 *      class Test{
 *      	int data=10; //멤버변수
 *      	void test(){ int x=5; //지역변수}
 *      	void sample(int z//매개변수){int y=6;}    
 *       }
 * 지역변수 : 지역변수를 JVM(자바가상머신)에서 제공하는 기본값이 없다.
 * 매개변수 : 메소드에서 인자값을 받기 위한 변수이다
 */
class MemberVar{
	byte var_byte; //0
	short var_short; //0
	int var_int; //0
	long var_long; //0L
	float var_float; //0.0F
	double var_double; //O.O
	char var_char; //u\0000
	boolean var_boolean; //false
	String var_data; //null
}


public class Java061_class {
	
	public static void main(String[] args) {

		MemberVar mv=new MemberVar();
		System.out.printf("var_byte=%d\n", mv.var_byte);
		System.out.printf("var_short=%d\n", mv.var_short);
		System.out.printf("var_long=%d\n", mv.var_long);
		System.out.printf("var_float=%f\n", mv.var_float);
		System.out.printf("var_double=%f\n", mv.var_double);
		System.out.printf("var_char=%c\n", mv.var_char);
		System.out.printf("var_boolean=%b\n", mv.var_boolean);
		System.out.printf("var_data=%s\n", mv.var_data);
		
	}//end main()

}//end class
