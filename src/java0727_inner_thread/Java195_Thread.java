package java0727_inner_thread;

class User4 extends Thread{
	
	public void run() {
		for(int i=1; i<=10; i++){
			System.out.printf("%s i=%d priority=%d\n",getName(),i, getPriority());
		}
	}
	
}


public class Java195_Thread {

	public static void main(String[] args) {
		User4 user=new User4();
		user.setName("user");//쓰레드명을 메소드 이용해서 지정
		
		//스레드의 우선순위는 1~10까지 지정할 수 있다
		//기본값은 5이다
		user.setPriority(Thread.MAX_PRIORITY);//10
		user.start();//쓰레드 디폴트 우선순위는 5이다
		
		User4 user2=new User4();
		user2.setName("user2");
		user2.setPriority(Thread.MIN_PRIORITY);//1
		user2.start();
		
		User4 user3=new User4();
		user3.setName("user3");
		user3.setPriority(8);
		user3.start();
		
		//확률적으로 우선순위가 높은 것이 먼저 수행된다(단, 우선순위가 높은 것이 100% 먼저 수행되는 것은 아니다)
		
	}//end main
	
}//end class
