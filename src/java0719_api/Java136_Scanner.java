package java0719_api;

import java.util.Scanner;

public class Java136_Scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("단입력: ");
		int dan=sc.nextInt();//String을 받아서 int로 넘겨준다
		for(int i=1; i<10; i++){
			System.out.printf("%d X %d =%2d\n",dan,i,dan*i);
		}
		
	}//end main
	
}//end class
