package workbook.StepB;
import java.util.Scanner;

public class B3 {

	private int weight;
	private int height;
	private int area;

	public B3() {
		input();
	}

	public void printB3() {
		System.out.println("직사각형의 넓이는,"+output()+"이고,\n");
		if(this.height == this.weight)
			System.out.println("정사각형 입니다.\n");
		else
			System.out.println("정사각형이 아닙니다.\n");
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
