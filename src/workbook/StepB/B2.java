package workbook.StepB;
import java.util.Scanner;

public class B2 {
	
	private double input_degree;
	private double output_degree;
	private String kind;

	public B2() {input();}

	public void printB2() {
		if(kind.equalsIgnoreCase("C"))
				System.out.println("변환된 온도는,"+output_c()+"입니다.\n");
		else
			System.out.println("변환된 온도는,"+output_f()+"입니다.\n");
	}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("온도를 입력하세요.\n");
		this.input_degree = s.nextDouble();
		System.out.println("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요.\n");
		this.kind= s.next();	
	}
	double output_c() {

		this.output_degree = (input_degree-32) / 1.8;

		return this.output_degree;

	}
	double output_f() {

			this.output_degree = input_degree * 1.8 + 3.2;

			return this.output_degree;

		}

}
