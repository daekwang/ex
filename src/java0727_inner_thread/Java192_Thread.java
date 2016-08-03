package java0727_inner_thread;
/*
 * 프로세스 : 메모리에서 실행중인 프로그램이다.
 * 스레드(thread) : 프로세스에서 독립적으로 실행되는 단위이다.
 * 
 * 자바에서 스레드 생성을 위해 제공해주는 2가지 방법
 * 1. java.lang.Thread클래스
 * 2. java.lang.Runnable인터페이스
 * 
 * 스케줄링
 *  : 스레드가 생성되어 실행될 때 필요한 시스템의 여러 자원을 
 *  해당 스레드에게 할당하는 작업
 *  
 *  선점형 스케줄링
 *  : 하나의 스레드가 cpu을 할당받아 실행하고 있을 때 우선순위가
 *  높은 다른 스레드가 cpu를 강제로 빼앗아 사용할 수 있는
 *  스케줄링 기법이다.
 */
class User extends Thread{
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name){
		super(name);
	}
	
	public void run(){
		//thread로 실행시켜줄 문장을 run()메소드에서 구현한다
		for(int j=0; j<=5; j++){
			System.out.printf("%s j=%d\n", getName(), j);
		}
		
	}
	
}

public class Java192_Thread {

	public static void main(String[] args) {
		User user=new User();//main thread
		//user가 쓰레드로 돌아가게 하려면 .start()메소드를 호출해줘야 한다. 단순히 run()은 메소드를 호출한것
		user.start();//Thread-0 thread, thread가 2개 돌아간다
		
		User user2=new User("user");//생성자를 통해서 쓰레드명 지정
		user2.start();//Thread-1 thread, 쓰레드 명을 지정할 수 있다
		
		System.out.println("main thread end");
		//thread가 2개 생겨 하나의 프로세스에서 2개가 각각 작동한다
		//다중 쓰레드는 각 쓰레드가 자신의 일을 하기 때문에 이것을 합쳐서 생각하면 안된다
		
	}//end main
	
}//end class
