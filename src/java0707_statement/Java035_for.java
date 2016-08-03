package java0707_statement;
/*
 * 반복문에서 특정 위치로 이동(continue)을 하거나 빠져나오도록(break)할 때
 * 반복문에 label명을 지정하고 호출하면 된다
 */

public class Java035_for {

	public static void main(String[] args) {
		int cnt=0;
		move: //반복문에서 자신의 반복문이 아닌 윗단계의 반복문을 빠져나오기 위해 'label'을 지정한다 
		for(int i=1; i<=5; i++){
			
			for(int j=1; j<=5; j++){
				cnt++;
				if(cnt%3!=0)
				//break move;
				continue move;
				System.out.println(cnt+"\t");
			}
			
		}

	}//end main()

}//end class
