package workbook.StepG;

import java.util.Scanner;

public class StepGManager {
	public StepGManager() {
	int menu;
	Scanner s = new Scanner(System.in);
	while(true) {
		printf("---------------------\n");
		printf("1. 나이 계산 및 연령대 판정\n");
		printf("2. 물의 온도 구간 판정\n");
		printf("3. 점수 계산\n");
		printf("4. 부동산 중개 수수료 계산기\n");
		printf("5. PC방 이용료 계산기\n");
		printf("6. 쇼핑몰 매출 계산기\n");
		printf("7. 놀이공원 매표소\n");
		printf("=>원하는 메뉴는?(0:exit) :");
		menu = s.nextInt();
		if(menu == 0) break;
		switch(menu) {
		case 1:
			G1 g1 = new G1();
			g1.printG1();
			break;
		case 2:
			G2 g2 = new G2();
			g2.printG2();
			break;
		case 3:
			G3 g3 = new G3();
			g3.printG3();
			break;
		case 4:
			G4 g4 = new G4();
			g4.printG4();
			break;
		case 5:
			G5 g5 = new G5();
			g5.printG5();
			break;
		case 6:
			G6 g6 = new G6();
			g6.printG6();
			break;
		case 7:
			G7 g7 = new G7();
			g7.printG7();
			break;
			
		}
	}
	
	}
	void printf(String s){System.out.print(s);} 
	
}
