package workbook.StepB;
import java.util.Scanner;

public class B6 {
	
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double ave;


	public B6() {input();}
	public void printB6() {
		System.out.println("입력하신 점수의 총점은"+output()+"이고,\n");
		System.out.println("평균은,"+output_ave()+"입니다.\n");
		if(kor >= 90)
			System.out.println("국어점수가 우수합니다.\n");
		if(eng >= 90)
			System.out.println("영어점수가 우수합니다.\n");
		if(math >= 90)
			System.out.println("수학점수가 우수합니다.\n");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요.\n");
		this.kor = s.nextInt();
		System.out.println("영어점수를 입력하세요.\n");
		this.eng = s.nextInt();
		System.out.println("수학점수를 입력하세요.\n");
		this.math = s.nextInt();
	}

	int output() {
		this.total = this.kor+ this.eng+ this.math;
		return this.total;
	}

	double output_ave() {
		this.ave = this.total/3.0;
		return this.ave;
	}


}
