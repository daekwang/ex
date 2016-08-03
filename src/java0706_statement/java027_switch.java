package java0706_statement;

public class java027_switch {

	public static void main(String[] args) {
		
		char ope='/';
		int numX=10;
		int numY=5;
		int res=0;
		
		switch(ope){
		case '+':
			res= numX+numY;
			break;
		case '-':
			res= numX-numY;
			break;
		case '*':
			res= numX*numY;
			break;
		case '/':
			res= numX/numY;
			break;
		default : 
			System.out.println("시스템연산이 아닙니다.");
		    return;//현재실행중인 메소드를 완전히 빠져나옴
		    
		}
		System.out.printf("%d %c %d = %d\n",numX,ope,numY,res);
		

	}//end main()

}//end class()
