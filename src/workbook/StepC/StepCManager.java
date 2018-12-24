package workbook.StepC;

import java.util.Scanner;

public class StepCManager {
	public StepCManager() {
	int menu;
	Scanner s = new Scanner(System.in);
	while(true) {
		printf("---------------------\n");
		printf("1. 나이계산 및 연령대 판정\n");
		printf("2. 물의 온도 구간 판정\n");
		printf("3. 직사각형 형태 판정\n");
		printf("4. 아파트 평형 계산 및 종류 판정\n");
		printf("5. 연증 날짜 계산\n");
		printf("6. 점수 계산\n");
		printf("7. 파일 전송 시간 계산\n");
		printf("8. 3개의 수 중 최댓값과 최솟값 구하기\n");
		printf("9. 소득세 계산\n");
		printf("10. 간단한 사칙연산 계산기\n");
		printf("11. 윤년 판정하기\n");
		printf("=>원하는 메뉴는?(0:exit) :");
		menu = s.nextInt();
		if(menu == 0) break;
		switch(menu) {
		case 1:
			C1 c1 = new C1();
			c1.printC1();
			break;
		case 2:
			C2 c2 = new C2();
			c2.printC2();
			break;
		case 3:
			C3 c3 = new C3();
			c3.printC3();
			break;
		case 4:
			C4 c4 = new C4();
			c4.printC4();
			break;
		case 5:
			C5 c5 = new C5();
			c5.printC5();
			break;
		case 6:
			C6 c6 = new C6();
			c6.printC6();
			break;
		case 7:
			C7 c7 = new C7();
			c7.printC7();
			break;
		case 8:
			C8 c8 = new C8();
			c8.printC8();
			break;
		case 9:
			C9 c9 = new C9();
			c9.printC9();
			break;
		case 10:
			C10 c10 = new C10();
			c10.printC10();
			break;
		case 11:
			C11 c11 = new C11();
			c11.printC11();
			break;

		}
	}
	
	}
	void printf(String s){System.out.print(s);} 
	
}
