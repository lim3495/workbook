package workbook.StepD;

import java.util.Scanner;

public class D8 {
	
	private int a,b,c;
	private int x_begin,x_end;
	private int x,y;
	
	public D8() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("2차 함수 y=ax^2+bx+c의 계수 a와b,c를 입력하시오.\n");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오.\n");
		x_begin = s.nextInt();
		x_end = s.nextInt();
	}
	
	public void printD8() {
		
		for(x = x_begin ; x <= x_end ; x++) {
			y = (a * x * x) + (b * x) + c;
			System.out.printf("좌표(%d,%d)\n",x,y);
		}
			
		
		
		
	}

}
