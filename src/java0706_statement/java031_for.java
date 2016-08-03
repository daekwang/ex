package java0706_statement;

public class java031_for {

	public static void main(String[] args) {
		
		int odd=0;//홀수 누적
		int even=0;//짝수 누적
		//int sum;하면 주소공간에 값이 없으므로 오류가 뜬다
		for(int i=1; i<=10;i++){
			
			if(i%2==0){
				even+=i;
			}else if(i%2!=0){
				odd+=i;
			}
			
			
		}
		System.out.printf("짝수누적 : %d\n",even);
		System.out.printf("홀수누적 : %d\n",odd);
		
		
	}//end main()

}//end class()
