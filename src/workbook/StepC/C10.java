package workbook.StepC;

import java.util.Scanner;

public class C10 {
	
	private int num1,num2;
	private String operator;
	private int result;
	
	public C10() {
		input();
	}
	
	public void printC10() {
		System.out.println("계산식의 결과값은,"+output()+"입니다.\n");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자1 을 입력하세요.\n");
		num1 = s.nextInt();
		System.out.println("숫자2 을 입력하세요.\n");
		num2 = s.nextInt();
		System.out.println("연산기호문자('+','-','*','/'중 1개)를 입력하세요.\n");
		operator = s.next();
	}
	int output() {
		
		if(operator.equalsIgnoreCase("+"))
			result = num1 + num2;
		else if(operator.equalsIgnoreCase("-"))
			result = num1 - num2;
		else if(operator.equalsIgnoreCase("*"))
			result = num1 * num2;
		else if(operator.equalsIgnoreCase("/"))
			result = num1 / num2;
		
		return this.result;	
	}

}
