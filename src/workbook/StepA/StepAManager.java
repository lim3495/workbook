package workbook.StepA;

import java.util.Scanner;

public class StepAManager {
   public StepAManager() {
      int menu;
      Scanner s = new Scanner(System.in);
      while(true) {
         printf("---------------------\n");
         printf("1. 나이계산\n");
         printf("2. 온도변환\n");
         printf("3. 직사각형 넓이계산\n");
         printf("4. 아파트 평형 계산\n");
         printf("5. 날짜계산\n");
         printf("6. 점수계산\n");
         printf("7. 파일 용량 계산\n");
         printf("=>원하는 메뉴는?(0:exit) :");
         menu = s.nextInt();
         if(menu == 0) break;
         switch(menu) {
         case 1: 				
        	 	A1 a1 = new A1();
				a1.printA1();
				break;
			case 2:
				A2 a2 = new A2();
				a2.printA2();
				break;
			case 3:
				A3 a3 = new A3();
				a3.printA3();
				break;
			case 4:
				A4 a4 = new A4();
				a4.printA4();
				break;
			case 5:
				A5 a5 = new A5();
				a5.printA5();
				break;
			case 6:
				A6 a6 = new A6();
				a6.printA6();
				break;
			case 7:
				A7 a7 = new A7();
				a7.printA7();
				break;
         }
      }
      
   }
   void printf(String s){System.out.print(s);} 
}