package workbook.StepB;
import java.util.Scanner;

public class B9 {

	private int height,weight;
	private int bmi;

	public B9() {input();}
	public void printB9() {
		if(out_bmi() > 25)
			System.out.println("당신은 비만이십니다.\n");
		else
			System.out.println("당신은 비만이 아니군요.\n");
	}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("신장(cm단위)을 입력하세요.");
		this.height = s.nextInt();
		System.out.println("체중(kg단위)을 입력하세요.");
		this.weight = s.nextInt();
	}

	int out_bmi() {
		this.bmi = weight / (int)((height * 0.1)*(height * 0.1));
		return this.bmi;
	}

	
}
