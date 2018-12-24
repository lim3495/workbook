package workbook.StepA;
import java.util.Scanner;

public class A4 {
	
	private double m2_area;
	private double pyung_area;

	public A4() {input();}
	public void printA4() {
		System.out.println("아파트의 평형은"+output()+"입니다.\n");
	}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("아파트의 분양면적을 입력하시오.\n");
		this.m2_area = s.nextDouble();
	}

	double output() {
		this.pyung_area = this.m2_area / 3.305;
		return this.pyung_area;
	}

	

}
