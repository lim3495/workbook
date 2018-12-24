package workbook.StepD;

import java.util.Scanner;

public class D3 {
	
	private int number;
	private int count = 0;
	private int totalsum = 0;
	private double average;

	public D3() {
		input();
	}
	
	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("\n0부터 100 사이의 숫자를 입력하세요.\n");
			number = s.nextInt();
			count ++;
			if(number <0 || number >100) break;
			
			total_sum();
		}//while
		
		average();
	}
	
	void total_sum() {
		totalsum += number;
	}
	
	void average() {
		
		average = (double)(totalsum / count) ; 

	}
	
	public void printD3() {
		System.out.printf("입력한 %d 개의 숫자들의 총합계는 %d 이고,평균 값은 %.1f 입니다.\n",count,totalsum,average);
	}
}