package java0720_api.prob;

import java.io.InputStreamReader; 
import java.io.BufferedReader; 
import java.util.*; 
import java.io.IOException; 
class Calender{ 
   private int year; 
   private int month; 
   private int start_day_of_week; 
   private int end_day; 
   //초기화 
   public Calender(int year, int month){ 
      this.year = year; 
      this.month = month; 
      CalculationStartDate(); 
      CalculationEndDate(); 
   } 
   //시작 날자 계산(올려주신 소스만 뽑아냈어요) 
   private void CalculationStartDate(){ 
      Calendar sDay = new GregorianCalendar(); //시작 날자 
      sDay.set(year, month-1, 1); 
      start_day_of_week = sDay.get(Calendar.DAY_OF_WEEK); 
   } 
   //마지막 일 계산(이것도 소스 뽑아서 붙여넣기 ㅋ) 
   private void CalculationEndDate(){ 
      Calendar eDay = new GregorianCalendar(); //끝일 
      eDay.set(year, month, 1); 
      eDay.add(Calendar.DATE, -1); 
      end_day = eDay.get(Calendar.DATE); 
   } 
   public void Display(){ 
      int number_of_week = 0; 
      int date = 1; 
      int temp_start_day_of_week = start_day_of_week; 
      if((start_day_of_week+end_day)%7 == 0)  { 
         number_of_week = (start_day_of_week+end_day)/7; 
         } else { 
         number_of_week = ((start_day_of_week+end_day)/7) + 1; 
      } 
      System.out.println("-------------     "+year+"년 "+month+"월 달력     -------------"); 
      System.out.printf("%6s%6s%6s%6s%6s%6s%6s\n", "일","월","화","수","목","금","토"); 
      for(int i=0; i<number_of_week; i++){ 
         System.out.println(); 
         while(date <= end_day){ 
            if(temp_start_day_of_week > 1){ 
               System.out.printf("%7s", " "); 
               temp_start_day_of_week--; 
               } else { 
               if((date+start_day_of_week-2)%7==0){ 
                  System.out.println(); 
               } 
               System.out.printf("%7d", date); 
               date++; 
            } 
         }  
      } 
   } 
} 
public class Test { 
   public static void main(String[] args) throws IOException{ 
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      System.out.println("년도를 입력하시오: " ); 
      int year = Integer.parseInt(br.readLine()); 
      System.out.println("월 입력하시오: " ); 
      int month = Integer.parseInt(br.readLine()); 
      Calender cal = new Calender(year, month); 
      cal.Display();  
   } 
} 
