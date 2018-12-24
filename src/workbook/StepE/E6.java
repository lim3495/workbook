package workbook.StepE;

import java.util.Scanner;

public class E6 {
	
	private int rows,columns;
	private int number;
	
	public E6() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("출력하려는 행의 크기와 열의 크기를 입력하시오.\n");
		rows = s.nextInt();
		columns = s.nextInt();
	}
	
	public void printE6() {
		
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j<= columns ; j++) {
				number = i*j;
				System.out.printf("\t%d",number);
			}
			System.out.printf("\n");
		}
	
	}

}
