package java0719_api;
/*
 * 1 기본자료형을  클래스로 정의해놓은 것을 Wrapper라 한다.
 * char -> Character
 * byte  -> Byte
 * short  -> Short
 * 
 * int	  -> Integer
 * long   -> Long
 * float  -> Float
 * double -> Double
 * boolean -> Boolean
 * 
 * 2 메모리에 저장된 값을 다른 자료형으로 변환해주는 메소드를
 *   제공하기위해서  Wrapper클래스를 제공한다.
 *   
 *3 auto boxing과 auto unboxing은 jdk5.0에서 추가된 기능이다.
 *  auto boxing
 *   => 스택 -> 힙영역에 복사
 *  auto unboxing => 힙 -> 스택영역에 복사
 */

public class Java137_Wrapper {

	public static void main(String[] args) {
		String data="12213";
		//String -> Integer
		Integer it=new Integer(data);
		//Integer -> int
		int num=it.intValue();
		System.out.println("num: "+num);
		
		double pro=it.doubleValue();
		System.out.println("pro: "+pro);
		
		long nn=it.longValue();
		System.out.println("nn: "+nn);
		
		float ft=it.floatValue();
		System.out.println("ft= "+ft);
		
		//String -> int
		int num2=Integer.parseInt(data);
		System.out.println("num2: "+num2);
		
		//String -> double
		double num3=Double.parseDouble(data);
		System.out.println("num3: "+num3);
		
		//Stirng -> float
		float num4=Float.parseFloat(data);
		System.out.println("num4: "+num4);
		
		int x=10; //stack
		//Integer ie=new Integer(x); -> 원래는 이래야 되지만
		Integer in=x; //auto boxing 발생(stack -> heap 복사)
		
		int y=in; //auto unboxing(heap -> stack)
		System.out.println("y: "+y);
		
		
	}
	
}
