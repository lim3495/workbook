package workbook.StepE;

import java.util.Scanner;

public class StepEManager {
	public StepEManager() {
	int menu;
	Scanner s = new Scanner(System.in);
	while(true) {
		printf("---------------------\n");
		printf("1. 입력한 숫자 크기의 정사각형 출력하기\n");
		printf("2. 입력한 숫자 크기의 높이를 갖는 우직각 삼각형 출력하기\n");
		printf("3. 입력한 숫자 크기의 높이를 갖는 이등변 삼각형 출력하기\n");
		printf("4. 홀수단 또는 짝수단의 구구단 출력하기\n");
		printf("5. 홀수단 또는 짝수단의 구구단을 열의 개수에 맞추어 출력하기\n");
		printf("6. 2차원 숫자 출력하기\n");
		printf("=>원하는 메뉴는?(0:exit) :");
		menu = s.nextInt();
		if(menu == 0) break;
		switch(menu) {
		case 1:
			E1 e1 = new E1();
			e1.printE1();
			break;
		case 2:
			E2 e2 = new E2();
			e2.printE2();
			break;
		case 3:
			E3 e3 = new E3();
			e3.printE3();
			break;
		case 4:
			E4 e4 = new E4();
			e4.printE4();
			break;
		case 5:
			E5 e5 = new E5();
			e5.printE5();
			break;
		case 6:
			E6 e6 = new E6();
			e6.printE6();
			break;
		}
	}
	
	}
	void printf(String s){System.out.print(s);} 
	
}
