package java0725_collection.prob;

import java.util.ArrayList;

public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		// 구현하세요.
/*		ArrayList<BookDTO> aList=bookList;
		int totalPrice=0;
		
		for(int i=0; i<bookList.size(); i++){
			if(bookList.get(i).getKind()==kind){
				totalPrice+=bookList.get(i).getRentalPrice();
			}
		}
		return totalPrice;*/
		int data=0;
		for(BookDTO dto:bookList){
			if(dto.getKind()==kind){
				data+=dto.getRentalPrice();
			}
		}
		return data;
		
	}//end getRentalPrice()
}//end class






