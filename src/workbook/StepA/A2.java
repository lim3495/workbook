package workbook.StepA;
import java.util.Scanner;

public class A2 {
	
	private double c_degree;
	private double f_degree;

	public A2() {input();}

	public void printA2() {
		System.out.println("화씨온도는,"+output()+"입니다.\n");
	}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("섭씨온도 입력하세요..\n");
		this.c_degree = s.nextDouble();
	}
	double output() {

		this.f_degree = this.c_degree * 1.8 + 3.2;

		return this.f_degree;

	}
}
