package java0721_exception_stream;

/*
 * throws
 * 1 예외처리를 메소드를 호출한 다른 메소드에서 하도록 전달하는 기능이다.
 * 2 사용목적 : 예외가 발생된 메소드와 이를 호출하는 메소드 양쪽에서
 *            예외처리를 해주는 경우에 사용한다.
 * 3 java.io, java.net패키지에 많이 선언 되여 있다.
 */


public class Java151_exception {

	public static void main(String[] args) {
		String data1 = "12";
		String data2 = "0";

		int x = 0;
		int y = 0;
		try {
			x = Integer.parseInt(data1);
			y = Integer.parseInt(data2);
			display(x, y);
		} catch (NumberFormatException e) {
			System.out.println(e.toString());
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		}
	}// end main

	public static void display(int x, int y) throws ArithmeticException {
		//throws는 예외처리를 떠넘기는것이다. 해당 메소드를 호출하는 곳으로!
		int res = x / y;
		System.out.println(res);

	}// end display

}// end class
