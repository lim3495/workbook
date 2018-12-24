package workbook.StepA;
import java.util.Scanner;

public class A3 {
	
	private int weight;
	private int height;
	private int area;

	public A3() {
		input();
	}

	public void printA3() {
		System.out.println("\n직사각형의 넓이는,"+output()+"입니다.\n");
	}

	void input() {
		Scanner s = new Scanner(System.in);

		System.out.println("직사각형의 가로 크기를 입력하시오.");
		this.weight = s.nextInt();

		System.out.println("직사각형의 세로 크기를 입력하시오.");
		this.height = s.nextInt();
	}

	int output() {
		this.area = this.height * this.weight;

		return this.area;

	}
}
