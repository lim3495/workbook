package workbook.StepD;

import java.util.Scanner;

public class StepDManager {
	public StepDManager() {
	int menu;
	Scanner s = new Scanner(System.in);
	while(true) {
		printf("---------------------\n");
		printf("1. 1부터 숫자 더하기\n");
		printf("2. 입력 받은 숫자들 중에서 가장 큰 수와 작은 수 구하기\n");
		printf("3. 입력 받은 숫자들의 총합계와 평균 값 구하기\n");
		printf("4. 미성년자 숫자 세기\n");
		printf("5. 직사각형 형태 개수 세기\n");
		printf("6. 아파트 평형 계산 및 종류 판정\n");
		printf("7. 1차 메소두의 좌표 구하기\n");
		printf("8. 2차 메소드의 좌표 구하기\n");
		printf("9. 원하는 구구단의 단 출력하기\n");
		printf("10. 두 수의 배타적 배수 출력하기\n");
		printf("=>원하는 메뉴는?(0:exit) :");
		menu = s.nextInt();
		if(menu == 0) break;
		switch(menu) {
		case 1:
			D1 d1 = new D1();
			d1.printD1();
			break;
		case 2:
			D2 d2 = new D2();
			d2.printD2();
			break;
		case 3:
			D3 d3 = new D3();
			d3.printD3();
			break;
		case 4:
			D4 d4 = new D4();
			d4.printD4();
			break;
		case 5:
			D5 d5 = new D5();
			d5.printD5();
			break;
		case 6:
			D6 d6 = new D6();
			d6.printD6();
			break;
		case 7:
			D7 d7 = new D7();
			d7.printD7();
			break;
		case 8:
			D8 d8 = new D8();
			d8.printD8();
			break;
		case 9:
			D9 d9 = new D9();
			d9.printD9();
			break;
		case 10:
			D10 d10 = new D10();
			d10.printD10();
			break;

		}
	}
	
	}
	void printf(String s){System.out.print(s);} 
	
}
