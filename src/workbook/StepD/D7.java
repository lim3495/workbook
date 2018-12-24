package workbook.StepD;

import java.util.Scanner;

public class D7 {
	
	private int a,b;
	private int x_begin,x_end;
	private int x,y;
	
	public D7() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("1차 함수 y=ax+b의 계수 a와 b를 입력하시오.\n");
		a = s.nextInt();
		b = s.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오.\n");
		x_begin = s.nextInt();
		x_end = s.nextInt();

	}
	
	public void printD7() {
		
		for(x = x_begin ; x<= x_end ; x++) {
			y = a * x + b;
			System.out.printf("좌표(%d,%d)\n",x,y);
		}
		
			
	}
	
}
