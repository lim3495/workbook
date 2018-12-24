package workbook.StepC;

import java.util.Scanner;

public class C9 {
	
	private int income;
	private int tax;
	
	public C9() {
		input();
	}
	public void printC9() {
		System.out.println("연봉 금액에 대한 소득세는,"+output()+"원 입니다.\n");
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("연봉(원 단위)을 숫자로 입력하세요.\n");
		income = s.nextInt();	
	}
	
	int output() {
		if(income < 10000000)
			tax = (int)(income * 0.095);
		else if(income >= 10000000 && income < 40000000)
			tax = (int)(income * 0.19);
		else if(income >= 40000000 && income < 80000000)
			tax = (int)(income * 0.28);
		else 
			tax = (int)(income * 0.37);
		return this.tax;
	}

}
