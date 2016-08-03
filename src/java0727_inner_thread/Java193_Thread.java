package java0727_inner_thread;

class User2 implements Runnable{
	
	@Override
	public void run() {
		for(int j=0; j<=5; j++){
			System.out.printf("%s j=%d\n", Thread.currentThread().getName(), j);
		}
		
	}
}

public class Java193_Thread {
	
	public static void main(String[] args) {
		User2 user=new User2();
		Thread th=new Thread(user);//runnable은 start()를 바로 호출할 수 없기 때문에 쓰레드 생성자를 통하여 호출한다
		th.start();
		
		System.out.println("main thread end");
		//쓰레드 사용이유? '공유'의 문제. 프로세스에서 사용되는 자원들을 쓰레드에서 공유해서 사용할 목적으로 사용한다

	} // end main()
	
	
} // end class
