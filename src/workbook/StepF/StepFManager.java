package workbook.StepF;

import java.util.Scanner;

public class StepFManager {
	public StepFManager() {
	int menu;
	Scanner s = new Scanner(System.in);
	while(true) {
		printf("---------------------\n");
		printf("1. 두 번째로 큰 수의 순서 찾기\n");
		printf("2. 심사점수 계산\n");
		printf("3. 5명의 국, 영, 수 3과목 점수의 과목별 총점, 평균값 구하기\n");
		printf("4. 5명의 국, 영, 수 3과목 점수의 학생별 총점, 평균값 구하기\n");
		printf("5. 비만 판정\n");
		printf("6. 5층 아파트의 거주자 숫자 구하기\n");
		printf("7. 5층 아파트의 층별, 호수별 거주자 숫자 구하기\n");
		printf("8. 겹치지 않는 숫자 10개 입력받기\n");
		printf("9. 배열을 이용한 연중 날짜 계산\n");
		printf("=>원하는 메뉴는?(0:exit) :");
		menu = s.nextInt();
		if(menu == 0) break;
		switch(menu) {
		case 1:
			F1 f1 = new F1();
			f1.printF1();
			break;
		case 2:
			F2 f2 = new F2();
			f2.printF2();
			break;
		case 3:
			F3 f3 = new F3();
			f3.printF3();
			break;
		case 4:
			F4 f4 = new F4();
			f4.printF4();
			break;
		case 5:
			F5 f5 = new F5();
			f5.printF5();
			break;
		case 6:
			F6 f6 = new F6();
			f6.printF6();
			break;
		case 7:
			F7 f7 = new F7();
			f7.printF7();
			break;
		case 8:
			F8 f8 = new F8();
			f8.printF8();
			break;
		case 9:
			F9 f9 = new F9();
			f9.printF9();
			break;
		}
	}
	
	}
	void printf(String s){System.out.print(s);} 
	
}
