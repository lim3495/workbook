package workbook.StepA;
import java.util.Scanner;

public class A5 {
	
	private int days;
	private int seconds;

	public A5() {input();}
	public void printA5() {
		System.out.println("날 수에 해당하는 시간은 모두,"+output()+"초 입니다.\n");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("날 수를 입력하세요.\n");
		this.days = s.nextInt();
	}

	int output() {
		this.seconds = this.days*24*60*60;
		return this.seconds;
	}
}
