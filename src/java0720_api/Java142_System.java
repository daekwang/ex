package java0720_api;

public class Java142_System {

	public static void main(String[] args) {
		int[] arr1={1,5,2,4};
		int[] arr2={6,3,9,7,8};
		int[] arr3=process(arr1,arr2);
		for(int data:arr3){
			System.out.printf("%3d", data);
		}
		
	}//end main
	
	public static int[] process(int[] arr1, int[] arr2){
		int[] arr3=new int[arr1.length+arr2.length];
		
		/*for(int i=0; i<arr1.length; i++){
			arr3[i]=arr1[i];
		}
		for(int i=0; i<arr2.length; i++){
			arr3[arr1.length+i]=arr2[i];
		}*/
		
		//arraycopy(src, srcPos, dest, destPos, length)
		//arr1의 객체를 0번째부터 arr3의 0번째부터 arr1.length까지 넣어줘라
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		//arr2의 객체를 0번째부터 arr3의 arr1.length부터 arr2.length까지 넣어줘라
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		
		return arr3;
		
	}//end process
	
}//end class
