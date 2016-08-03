package java0719_api;
/*
 * 이름, 학점을 입력하는 프로그램을 구현하시오.
 * 입력 : 홍길동,80,93
 * 
 * [출력결과]
 * 이름: 홍길동
 * 국어: 80
 * 영어: 93
 * 평균: 86.5 (double로 계산)
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Java141_Wrapper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		String[] data=input.split(",");
		double avg=(Double.parseDouble(data[1])+Double.parseDouble(data[2]))/2;
		System.out.println("입력: "+input);
		System.out.println("이름: "+data[0]);
		System.out.println("국어: "+data[1]);
		System.out.println("영어: "+data[2]);
		System.out.println("평균: "+avg);
		
		
	}// end main()

}// end class







