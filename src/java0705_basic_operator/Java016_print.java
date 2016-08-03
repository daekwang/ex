package java0705_basic_operator;
/*
 * \n은 엔터키의 역할
 * \t은 탭키의 역할
 * 출력기호
 * %d: 정수
 * %s: 문자열
 * %f: 실수 , %.1f는 소수점 첫째자리까지만 나타냄
 * %c: 문자
 * %b: 논리
 * \": 쌍따옴표를 쓰고 싶을 때 쓴다
 * % : %를 쓰고 싶을 때는 %를 2개 %%로 쓴다
 * %5: %뒤에 숫자를 써주면 자리수로서 공백을 만들어준다
 */

public class Java016_print {

	public static void main(String[] args) {
		System.out.println("java");
		System.out.print("jsp\t");
		System.out.print("spring\n");
		
		//System.out.printf("출력 형식", 값1, 값2, 값3, ...);
		System.out.printf("%s님의 평균은 %.1f 이므로 %c 입니다.\n", "홍길동", 95.0, 'A');
		
		System.out.printf("당신의 색깔은 \"%s\"입니다.\n", "빨강");
		System.out.printf("%d %% %d=%d\n", 3, 2 , 3%2);
		System.out.printf("%s\n", "abcdefghi");
		System.out.printf("%5s\n", "ab");
		System.out.printf("%6s\n", "자바");
		System.out.printf("%f\n", 12345.45);
		System.out.printf("%5.1f\n", 12.42);
		
	}//end main()

}//end class
