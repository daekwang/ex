package java0708_method;

public class Java050_method {
	static int[] num=new int[]{3, 5, 9};
	
	
	public static void main(String[] args) {
		//int data=process(); //1
		//System.out.println(data);
		System.out.println(process());
	}//end main()

	public static int process(){
		int sum=0;//2
		
		for(int i=0; i<num.length; i++){ //3
			sum+=num[i];
		}
		return sum;//4
	}//end process
	
}//end class
