package java0727_inner_thread;

/*
 * 쓰레드 생명주기(Life Cycle)
 * start() - 실행준비상태(Runnable상태) - run() - dead 
 */


class User3 extends Thread{
	
	public User3() {
		
	}
	
	public User3(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(getState());
		
		for(int i=1; i<=10; i++){
			
			try {
				//1000은 1초를 의미, run()은 오버라이딩 됐기 때문에 throws, 즉 예외를 던질 수 없다. 따라서 여기서 예외처리해야한다
				Thread.sleep(1000);//sleep() 호출 시, WAITTING(NOT RUNNABLE)- 임시정지상태로 바뀐다
				System.out.printf("%s i=%d\n", getName(), i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class Java194_Thread {

	public static void main(String[] args) {
		User3 user=new User3("user");
		System.out.println(user.getState());//현재 스레드의 상태 값을 가져온다(getState()), NEW
		
		user.start();//실행준비상태, run()메소드 실행하며 RUNNABLE상태가 된다
		
		try {
			//join(): 지정된 시간동안 스레드가 실행되도록 한다(user스레드를 끝내기전까지 main스레드를 실행안함)
			//지정된 시간이 지나가거나 종료가 되면 join()을 호출한 스레드로 다시 돌아와 실행을
			//계속 수행한다.
			user.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		System.out.println(user.getState()); //TERMINATED
		System.out.println("main end");
		
		
	}//end main
	
}//end class
