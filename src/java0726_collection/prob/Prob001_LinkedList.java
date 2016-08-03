package java0726_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * LinkedList
 * 1 List : 순서적으로 데이터를 저장
 * 2 Stack : LIFO
 * 3 Queue : FIFO
 */

public class Prob001_LinkedList {

	public static void main(String[] args) {
		/*
		 * booklist.txt파일의 데이터를 Stack으로 처리하여 출력되도록 프로그램을 구현하시오. title publisher
		 * writer price JSP Programming JSPPub JSPExpert 21000 Servlet
		 * Programming WeBBest GoodName 20000 JDBC Programming JDBCBest NaDo SQL
		 * 30000 SQL Fundmental SQLBest Na SQL 47000 Java Programming JavaBest
		 * Kim kava 25000
		 */
		File file = new File("./src/java0726_collection/prob/booklist.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			LinkedList<Book> nList = new LinkedList<Book>();

			while (sc.hasNextLine()) {
				String[] list = sc.nextLine().split("/");
				Book book = new Book(list[0], list[1], list[2], list[3]);
				nList.push(book);
			}

			while (!nList.isEmpty()) {
				Book b = nList.pop();
				System.out.println(b.getPrice());

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// end main()

}// end class
