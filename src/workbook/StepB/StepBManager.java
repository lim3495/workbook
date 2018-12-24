package workbook.StepB;
import java.util.Scanner;

public class StepBManager {
	
	public StepBManager() {
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
			printf("8. 다양한 조건 판정\n");
			printf("9. 비만 판정\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				B1 b1 = new B1();
				b1.printB1();
				break;
			case 2:
				B2 b2 = new B2();
				b2.printB2();
				break;
			case 3:
				B3 b3 = new B3();
				b3.printB3();
				break;
			case 4:
				B4 b4 = new B4();
				b4.printB4();
				break;
			case 5:
				B5 b5 = new B5();
				b5.printB5();
				break;
			case 6:
				B6 b6 = new B6();
				b6.printB6();
				break;
			case 7:
				B7 b7 = new B7();
				b7.printB7();
				break;
			case 8:
				B8 b8 = new B8();
				b8.printB8();
			case 9:
				B9 b9 = new B9();
				b9.printB9();
			}
		}

		}
		void printf(String s){System.out.print(s);} 

	
	
}
