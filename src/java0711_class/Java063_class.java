package java0711_class;
/*
 * 생성자(constructor)
 * 1. 멤버변수의 초기화를 위해 한번만 호출된다.
 * 2. 클래스에는 반드시 한개 이상의 생성자가 있어야 한다.
 * 3. 생성자명은 클래스명하고 같다.
 * 4. 생성자는 리턴값이 없다.(void를 쓰지 않는다.) 
 * 5. 클래스에 생성자가 정의되여 있지 않으면 JVM은 기본생성자를 제공한다.
 * 6. 기본생성자의 접근제어자는 클래스의 접근제어자를 따르고 구조는
 *     생성자명( ) { } 이다.
 * 
 * 기본생성자(default constructor)
 * 1 매개변수가 없는 생성자이다. => 생성자명( ) { }
 * 2 클래스에 생성자가 없으면 JVM에서 기본생성자를 추가해 준다.
 * 
 * this : 객체 자신을 의미한다.
 * this.멤버변수
 * this.메소드( )
 * this( ) 
 */
class CustomerList{
	String name;
	char gen;
	String addr;
	
	public CustomerList(){//2
		this("홍길동", '남', "충청남도");//3
	}
	
	public CustomerList(String name, char gen, String addr){//4
		//멤버변수와 매개변수가 다를때는 멤버변수에 this키워드를 사용하지 않아도된다
		//name=n;
		
		//멤버변수와 매개변수가 같을때는 멤버변수에 this키워드를 사용한다
		this.name=name; //5
		this.gen=gen;//6
		this.addr=addr;//7
	}//8
	
	public void prn(){
		System.out.printf("%s %c %s\n", name, gen, addr);
	}
	
	public void call(){
		this.prn();
		//prn();
	}
}


public class Java063_class {

	public static void main(String[] args) {
		CustomerList cm=new CustomerList("이도룡",'남',"서울 종로구 가산동");
		cm.prn();
		
		CustomerList cs=new CustomerList();//1
		cs.prn();//10
		//0cs.call();
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		CustomerList[] cc=new CustomerList[2];
		cc[0]=cm;//cc[0]=new CustomerList("이도룡",'남',"서울 종로구 가산동");
		cc[1]=cs;
		
		for(int i=0; i<cc.length; i++){
			cc[i].prn();
		}
		
	}//end main()

}//end class
