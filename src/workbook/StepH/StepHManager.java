package workbook.StepH;
import java.util.Scanner;

public class StepHManager {
	
	public StepHManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 숫자 알아 맞추기 \n");
			printf("2. 로또 번호 만들기\n");
			printf("3. 로또 번호 당첨 확인하기\n");
			printf("4. 가위바위보 게임하기\n");
			printf("5. 슬롯머신 만들기\n");
			printf("6. 5개 숫자의 제곱수 조합 구하기\n");
			printf("7. 문자의 개수와 나누어 출력하기\n");
			printf("8. 문자열 바꾸기\n");
			printf("9. 사용자 정보 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				H1 h1 = new H1();
				h1.printH1();
				break;
			case 2:
				H2 h2 = new H2();
				break;
			case 3:
				H3 h3 = new H3();
				h3.printH3();
				break;
			case 4:
				H4 h4 = new H4();
				break;
			case 5:
				H5 h5 = new H5();
				h5.printH5();
				break;
			case 6:
				H6 h6 = new H6();
				h6.printH6();
				break;
			case 7:
				H7 h7 = new H7();
				break;
			case 8:
				H8 h8 = new H8();
				break;
			case 9:
				H9 h9 = new H9();
				break;
			}
		}

		}
		void printf(String s){System.out.print(s);} 

	
	
}
