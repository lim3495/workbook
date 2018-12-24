package workbook.StepE;

import java.util.Scanner;

public class E3 {
	private int height;
	
	public E3() {input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("이등변 삼각형 높이를 입력하시오.\n");
		height = s.nextInt();
	}
	public void printE3() {
		int i,j;	
		for(i = 1 ; i <= height ; i++) {
			for(j=0 ; j<= height-i ; j++)
				System.out.print(" ");
			for(j=0 ; j < 2*i -1 ; j++)
				System.out.print("*");
			for(j=0 ; j<= height-i ; j++)
				System.out.print(" ");
			System.out.println();
		}
		
	}
}
