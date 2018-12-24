package workbook.StepC;

import java.util.Scanner;

public class C1 {//연령대 판정
	
	private int birth_year;
	private int age;
	
	public C1() {input();}
	public void printC1() {
		if(output()<7)
			System.out.println("유아입니다.\n");
		else if(output()>=7 && output()<13)
			System.out.println("어린이입니다.\n");
		else if(output()>=13 && output()<20)
			System.out.println("청소년입니다.\n");
		else if(output()>=20 && output()<30)
			System.out.println("청년입니다.\n");
		else if(output()>=30 && output()<70)
			System.out.println("중년입니다.\n");
		else
			System.out.println("노년입니다.\n");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("테어난 년도를 입력하세요.\n");
		this.birth_year = s.nextInt();
	}
	int output() {
		age = 2018 - birth_year +1;
		
		return this.age;
	}
}
