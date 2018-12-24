package workbook.StepC;
import java.util.Scanner;

public class C6 {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double ave;


	public C6() {input();}
	public void printC6() {
		System.out.println("입력하신 점수의 총점은"+output()+"이고,\n");
		System.out.printf("평균은 %.1f 입니다.\n",output_ave());
		
		if(output_ave() >= 90)
			System.out.println("수 입니다.\n");
		else if(output_ave()>=80 && output_ave()<90)
			System.out.println("우 입니다.\n");
		else if(output_ave()>=70 && output_ave()<80)
			System.out.println("미 입니다.\n");
		else if(output_ave()>=70 && output_ave()<70)
			System.out.println("양 입니다.\n");
		else 
			System.out.println("가 입니다.\n");
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