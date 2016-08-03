package java0719_api;

import java.util.Random;

//한번 손으로써서 해보자
public class Java134_Random {

	public static void main(String[] args) {
		Random ran=new Random();
		int[] num=new int[3];
		
		//1부터 10까지의 정수값을 num배열에 저장
		
		for(int i=0; i<num.length; i++){
			/*int r1=ran.nextInt(10);
			r1+=1;
			num[i]=r1;*/
			num[i]=ran.nextInt(10)+1;
			
			//중복체크하기 위한 for문
			for(int j=0; j<i; j++){
				if(num[j]==num[i]){
					i--;
					break;
				}
			}
		}
		
		for(int data:num){
			System.out.println(data);
		}
		
		
		
		
	}
	
}
