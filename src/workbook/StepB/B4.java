package workbook.StepB;
import java.util.Scanner;

public class B4 {

	private double m2_area;
	private double pyung_area;

	public B4() {input();}
	public void printB4() {
		System.out.println("아파트의 평형은"+output()+"이고,\n");
		if(output()>=30)
			System.out.println("30평 이상이므로 큰 아파트 입니다.\n");
		else
			System.out.println("30평 미만이므로 작은 아파트 입니다.\n");

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
