package java0725_collection;


import java.util.Arrays;
import java.util.*;

public class Java178_ArrayList {

	public static void main(String[] args) {
		String[] arr={"oracle", "mysql", "mssql"};
		
		//배열 -> 컬렉션(List)
		List<String> list=Arrays.asList(arr);
		for(String data:list){
			System.out.println(data);
		}
	}//end main
	
}//end class
