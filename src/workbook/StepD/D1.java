package workbook.StepD;

import java.util.Scanner;

public class D1 {

	private int number;
	private int totalsum=0;
	
	public D1() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.\n");
		number = s.nextInt();		
	}
	
	public void printD1() {
		if(number <= 1)
			System.out.println("잘못 입력하였습니다.\n");
		else
			System.out.println("1부터 입력한 숫자까지의 모든 정수를 더한 값은"+total()+"입니다.\n");
	}

	int total() {
		
		for(int i=1 ; i<number ; i++)
			totalsum += i;
		
		return this.totalsum;
	}
	
}
