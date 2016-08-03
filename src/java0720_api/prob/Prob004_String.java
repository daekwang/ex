package java0720_api.prob;

import java.util.StringTokenizer;

/*
 * [출력결과]
 * *****음료수 주문****
 * 고객님은 음료수 콜라, 3개를 주문하셨습니다.
 * 지불하실 금액은 3000원 입니다.
 * 
 * * *****음료수 주문****
 * 고객님은 음료수 사이다, 2개를 주문하셨습니다.
 * 지불하실 금액은 2400원 입니다.
 */

public class Prob004_String {

	public static void main(String[] args) {
		String done="콜라:1000:3";
		String[] arr1=tokenData(done);
		Drink d1=process(arr1);
		d1.display();
		
		String dtwo="사이다:1200:2";
		String[] arr2=tokenData(dtwo);
		Drink d2=process(arr2);
		d2.display();

	}//end main()
	
	public static String[] tokenData(String data){
		StringTokenizer st=new StringTokenizer(data, ":");
		String[] arr=new String[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens()){
			arr[i]=st.nextToken();
			i++;
		}
		return arr;
	}
	
	public static Drink process(String[] data){
		Drink drink=new Drink();
		drink.setName(data[0]);
		drink.setPrice(Integer.parseInt(data[1]));
		drink.setCount(Integer.parseInt(data[2]));
		
		return drink;
	}
	
	

}//end class
