package java0722_stream_collection;

import java.util.Vector;

/*
 * 홍길동 30
 * 이영희 25
 */

class Person {
	String name;
	int age;

	public Person() {

	}

	public Person(String name, int age){
		super();
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String toString(){
		return name+" "+age;
	}
	
	
}// end class

public class java171_collection {

	public static void main(String[] args) {
	  /*Person p1=new Person("홍길동",30);
		Person p2=new Person("이영희",25);*/
		
		/*Person[] arr=new Person[2];
		arr[0]=new Person("홍길동",30);
		arr[1]=new Person("이영희",25);*/
		
		//위 처럼 할 수 있지만 크기가 유동적일 수 있기 때문에 컬렉션을 사용한다
		Vector<Person> v=new Vector<Person>();
		v.addElement(new Person("홍길동",30));
		v.addElement(new Person("이영희",25));
		
		for(Person pn:v){
			System.out.println(pn);
		}
		
		
	}// end main

}// end class
