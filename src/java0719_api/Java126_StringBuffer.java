package java0719_api;

public class Java126_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("java test");
		
		//4인덱스에 ",jsp"문자열을 삽입하여라
		//원래 4인덱스에 있던 공백은 뒤로 밀린다
		sb.insert(4, ",jsp");
		System.out.println(sb); //java,jsp test
		
		//4인덱스부터 8미만사이의 문자열을 삭제하여라
		sb.delete(4, 8);
		System.out.println(sb);//java test
		
		//0인덱스의 문자를 삭제하여라
		sb.deleteCharAt(0);
		System.out.println(sb);//ava test
		
		//" sample" 문자열을 추가하여라
		//문자열 맨뒤로 추가된다
		sb.append(" sample");//ava test sample
		System.out.println(sb);
		
		//문자열을 반대로 변경해서 reverse하여라
		sb.reverse();
		System.out.println(sb);//elpmas tset ava
		
		//String타입을 StringBuffer객체에 넣어서 사용할 수 있다
		String data="mybatis orm";
		StringBuffer ss=new StringBuffer(data);
		ss.reverse();
		System.out.println(ss);
		
		//char배열을 String으로 바꾸고 그 다음 StringBuffer에 넣어서 사용할 수 있다
		char[] arr=new char[]{'k','o','r','e','a'};
		String sn=new String(arr);
		//String sn=String.valueOf(arr);
		StringBuffer sf=new StringBuffer(sn);
		sf.reverse();
		System.out.println(sf);
		
		
		
	}//end main
	
}//end class
