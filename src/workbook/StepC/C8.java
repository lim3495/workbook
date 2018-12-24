package workbook.StepC;

import java.util.Scanner;

public class C8 {
	
	private int num1,num2,num3;
	private int max_num,min_num;
	
	public C8() { input(); }
	public void printC8() {
		System.out.println("가장 큰 수는,"+out_max()+"이고, 가장 작은 수는,"+out_min()+"입니다.\n");
		
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.\n");
		num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력하세요.\n");
		num2 = s.nextInt();
		System.out.println("세번째 숫자를 입력하세요.\n");
		num3 = s.nextInt();
		
	}
	
	int out_max() {
		
		max_num = num1;
		
		if(max_num < num2 && num3 < num2)
			max_num = num2;
		else if(max_num < num3 && num2 < num3)
			max_num = num3;
		
		return this.max_num;
		
	}
	
	int out_min() {
		
		min_num = num1;
		
		if(min_num > num2 && num3 > num2)
			min_num = num2;
		else if(min_num > num3 && num2 > num3)
			min_num = num3;
		
		return this.min_num;
	}

}
