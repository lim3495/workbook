package workbook.StepB;

import java.util.Scanner;

public class B1 {
	private int birth_year;
	private int age;

	public B1(){input();}
	public void printB1() {
		if(getAge()<20)
			System.out.printf("미성년자입니다.\n");
		else
			System.out.printf("미성년자가 아닙니다.\n");
	}	

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 년도를 입력하세요.");
		this.birth_year = s.nextInt();
	}	
	int getAge() {
		age = 2014 - birth_year + 1;
		return this.age;
	}	

}
