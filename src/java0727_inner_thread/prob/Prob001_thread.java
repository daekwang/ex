package java0727_inner_thread.prob;

class VendingMachine{
	VendingMachine vm;
	String name;

	public VendingMachine() {
		// TODO Auto-generated constructor stub
	}
	public VendingMachine(VendingMachine vm, String name) {
		this.vm=vm;
		this.name=name;
	}

}

class Producer extends Thread{
	VendingMachine vm;
	
	public Producer() {
		
	}
	
	public Producer(VendingMachine vm) {
		this.vm=vm;
	}

	
	
}

class Consumer extends Thread{
	VendingMachine vm;
	
	public Consumer() {
		
	}
	
	public Consumer(VendingMachine vm) {
		
	}
}


public class Prob001_thread {

	public static void main(String[] args) {
        VendingMachine vm=new VendingMachine();
        
        Producer p=new Producer(vm);
        Consumer c=new Consumer(vm);

	    Thread t1=new Thread(p, "생산자");
	    Thread t2=new Thread(c, "소비자");
	 
	    t1.start();
	    t2.start();
	}

}
