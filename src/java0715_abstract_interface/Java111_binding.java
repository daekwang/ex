package java0715_abstract_interface;

class ExamA{

}


class ExamB extends ExamA{
	
}

class ExamC extends ExamB{
	
}

class ExamD extends ExamC{
	
}

public class Java111_binding {

	public static void main(String[] args) {
		ExamB bb=new ExamB();
		System.out.println(bb instanceof ExamA);
		
		ExamA aa=new ExamA();
		bb=(ExamB)aa;
		System.out.println(bb instanceof ExamB);
		
		
	}
	
}
