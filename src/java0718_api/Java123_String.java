package java0718_api;

import java.util.regex.Pattern;

public class Java123_String {

	public static void main(String[] args) {
		String sn="12345";
		String sb="bab5ba";
		String st="aabbcc";
		
		//a-z A-Z _ * $가 sn변수에 포함되어 있으면 true, 아니면 false을 리턴한다
		// .* 여기서 .은 임의의 문자 한개를 의미한다
		System.out.println(sn.matches(".*[a-zA-z_*$].*"));
		
		//sn변수에 0-9가 포함이 되어 있으면 true, 아니면 false를 리턴한다
		//아래 두 가지는 같은값을 반환한다
		System.out.println(sn.matches(".*[0-9].*"));
		System.out.println(sn.matches(".*[\\d].*"));
		
		//sb변수에 저장된 값이 2로 시작이 되면 true를 리턴하고 아니면 false를 리턴한다
		System.out.println(sb.matches("[2].*"));
		
		//sb변수에 저장된 값이 2로 시작되고 5로 끝나면 true, 아니면 false
		System.out.println(sb.matches("[2].*[5]"));
		
		//sb변수에 저장된 문자열이 a이거나 b로 시작하고 총6자리 문자열이면 true, 아니면 false
		System.out.println("////");
		System.out.println(sb.matches("[ab].{5}"));
		
		// st변수에 저장된 문자열이 a 또는 b로 시작하고 cc로 끝나면서
				// 사이에는 임의문자가 최소 1개에서 최대4개를 포함한다.
				System.out.println(st.matches("[ab].{1,4}cc"));
				
				
				String input1 = "11mar123dd";
				String input2 = "maaaaa";
				String input3 = "252352";
				/*
				 * 주로 id나 비밀번호등 숫자나 문자가 포함되고 길이를 제한할 때 쓰이는 패턴이다
				 * Pattern.matches() : 빠르게 어떠한 text(String)이 주어진 Pattern 에 있는지를 확인한다.
				 * Pattern.compile() : 여러개의 텍스트를 재사용 가능한 Pattern 인스턴스로 컴파일 한다.
				 */
				
				System.out.println("aaaaaa");
				//input1에 [\d]라는 패턴이 find되면 true, 아니면 false
				System.out.println(Pattern.compile("[\\d]").matcher(input1).find());
				
				//\w->[a-zA-Z0-9]랑 똑같은 조건
				System.out.println(input1.matches("[\\w]{5,10}") && Pattern.compile("[\\d]").matcher(input1).find()
						&& Pattern.compile("[a-zA-Z]").matcher(input1).find());
				
				System.out.println(input2.matches("[\\w]{5,10}") && Pattern.compile("[\\d]").matcher(input2).find()
						&& Pattern.compile("[a-zA-Z]").matcher(input2).find());
				
				System.out.println(input3.matches("[\\w]{5,10}") && Pattern.compile("[\\d]").matcher(input3).find()
						&& Pattern.compile("[a-zA-Z]").matcher(input3).find());
	}

}
