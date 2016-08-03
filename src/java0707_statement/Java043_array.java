package java0707_statement;

public class Java043_array {

	public static void main(String[] args) {
		int[] data1=new int[3]; //byte, short, int의 초기값은 0이다
		long[] data2=new long[3]; //long의 초기값은 0L이다(int와 다름)
		float[] data3=new float[3]; //float의 초기값은 0.0F
		double[] data4=new double[3]; //double의 초기값은 0.0
		char[] data5=new char[3]; //char의 초기값은 공백(\u0000)
		boolean[] data6=new boolean[3]; //boolean의 초기값은 false
		String[] data7=new String[3]; //String의 초기값은 null(class의 초기값은 null)
		
		for(int i=0; i<data1.length; i++){
			System.out.println(data7[i]);
		}
		

	}//end main()	


}//end class
