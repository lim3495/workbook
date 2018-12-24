package workbook.StepB;
import java.util.Scanner;

public class B5 {
	
	private int days;
	private int seconds;
	private int m_count;

	public B5() {input();}
	public void printB5() {
		System.out.println("날 수에 해당하는 시간은 모두,"+output()+"초 입니다.\n");
		if(m_count >0)
			System.out.println("100만 초가 모두"+m_count+"번이나 포함됩니다.\n");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("날 수를 입력하세요.\n");
		this.days = s.nextInt();
	}

	int output() {
		seconds = days*24*60*60;
		m_count = seconds / 100000;
		return this.seconds;
	}

}
