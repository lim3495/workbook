package workbook.StepC;

import java.util.Scanner;

public class C2 {
	
	private double input_degree;
	
	public C2() {input();}
	public void printC2() {
		if(input_degree <0)
			System.out.println("잘못 입력하셨습니다.\n");
		else if(input_degree>=0 && input_degree<25)
			System.out.println("냉수 입니다.\n");
		else if(input_degree>=25 && input_degree<40)
			System.out.println("냉수 입니다.\n");
		else if(input_degree>=40 && input_degree<80)
			System.out.println("냉수 입니다.\n");
		else 
			System.out.println("끓는 물 입니다.\n");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("물의 온도를 입력하세요.\n");
		this.input_degree = s.nextDouble();
		}

}
