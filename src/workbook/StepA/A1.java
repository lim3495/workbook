package workbook.StepA;
import java.util.Scanner;

public class A1 {


	private int year;
	private int age;

	public A1(){input();}
	public void printAge() {
		System.out.printf("당신의 나이는 %d살 입니다.\n", getAge());
	}	

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 년도는?");
		this.year = s.nextInt();
	}	
	int getAge() {
		age = 2018 - year + 1;
		return this.age;
	}
}
