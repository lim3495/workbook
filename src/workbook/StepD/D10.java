package workbook.StepD;

import java.util.Scanner;

public class D10 {
	
	private int num1,num2;
	
	public D10() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("2개의 숫자를 입력하시오.\n");
		num1 = s.nextInt();
		num2 = s.nextInt();
	}
	
	public void printD10() {
		for(int i=1 ; i<=100 ; i++) {
			if( i % num1 == 0 && i % num2 != 0) 
				System.out.printf("%d ",i);
			if( i % num2 == 0 && i % num1 !=0)
				System.out.printf("%d ",i);
			
		
		}//for
			
		
	}
	

}
