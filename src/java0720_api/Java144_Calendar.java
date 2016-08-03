package java0720_api;

import java.util.Calendar;

abstract class Test{
	public static Test getInstance(){
		return null;
	};
}

class TestExam extends Test{
	
	public static Test getInstance(){ //Calendar클래스는 이런식으로 객체를 받아오는 것이다
		return new TestExam();
	}
	
}

public class Java144_Calendar {

	public static void main(String[] args) {
		//Calendar는 추상클래스이기 때문에 객체를 생성할 수 없다
		//Calendar cal=new Calendar();
		
		//Calendar 객체값을 받는 방법은 아래와 같다.
		//Calendar.getInstance();
		//Test tt=Test.getInstance() -> 추상클래스를 getInstance로 받아오는법, 위와 같다
		Calendar cal=Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);
		
		//Month는 1월 일때 0으로 리턴한다
		//따라서 월을 출력할때는 +1해준다
		//get(int field)-> 멤버변수로 바로 받아라 -> Calendar.멤버변수로 바로 호출한다 -
		int month=cal.get(Calendar.MONTH)+1;
	
		int date=cal.get(Calendar.DATE);
		//int hour=cal.get(Calendar.HOUR); ->12시간 표기법
		int hour=cal.get(Calendar.HOUR_OF_DAY); //-> 24시간 표기법
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d %d:%d:%d\n",year,month,date,hour,minute,second);
		
		//이번달의 마지막일 리턴
		System.out.println(cal.getMaximum(Calendar.DATE));
		
		//오늘의 요일 리턴(일요일이면 ->1로 리턴)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//오늘을 기준으로 5일전의 날짜를 리턴
		cal.add(Calendar.DATE, -5);
		System.out.println(cal.toString());
		
		
		//몇일인지를 세팅할때 cal.set
		cal.set(Calendar.DATE, 15);
		System.out.println(cal.get(Calendar.DATE));
		
		//월을 시스템에서 가지고 올때는 가지고온 것이 +1
		//월을 시스템에 세팅할 때는 -1
		cal.set(2015, 4, 20);
		
		System.out.println(cal.toString());
	}//end main
	

}//end class
