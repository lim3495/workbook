package workbook.StepD;

import java.util.Scanner;

public class D9 {//구구단
	
	private int dan;
	
	public D9() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("출력하고 싶은 구구단의 단 수를 입력하시오.(2-9)\n");
			dan = s.nextInt();
			
			if(dan >=2) break;
			
			System.out.print("잘못 입력하였습니다.\n");
			
		}//while
		
	}//input
	
	public void printD9() {
		
		for(int i=1 ; i<10 ; i++) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
		}
	}
	
	

}
