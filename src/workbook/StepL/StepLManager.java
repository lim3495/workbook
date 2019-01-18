package workbook.StepL;
import java.util.*;
import java.text.*;

public class StepLManager {
	
	public StepLManager() throws ParseException {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 저장하기\n");
			printf("2. 주차장 입출력 관리\n");
			printf("3. 식당 주문 관리\n");
			printf("4. 학생정보 관리\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				L1 l1 = new L1();
				l1.main();
				break;
			case 2:
				L2 l2 = new L2();
				l2.main();
				break;
			case 3:
				L3 l3 = new L3();
				l3.main();
				break;
			case 4:
				L4 l4 = new L4();
				l4.main();
				break;
	
			}
		}

		}
		void printf(String s){System.out.print(s);} 

	
	
}
