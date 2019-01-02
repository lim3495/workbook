package workbook.StepH;
import java.util.Scanner;
import java.util.Random;

public class H1 {
	
	private int answer;
	private int	number_try;
	int count=0;
	
	public H1() {
		Random generator = new Random();
		answer = generator.nextInt(100)+1;
		input();
	}
	
	void input()
	{	Scanner s = new Scanner(System.in);

		while(true) {
			
			System.out.println("1부터 100까지의 숫자 하나를 맞춰보세요.");
			this.number_try = s.nextInt();
			count++;
			
			if(this.number_try < answer) {
				System.out.println("조금 더 큰 수 입니다.");
			}
			else if(this.number_try > answer) {
				System.out.println("조금 더 작은 수 입니다.");	
			}
			else if(this.number_try == answer) 
				break;
			
		}
	}
	
	public void printH1() {
		System.out.println(count+"번 만에 숫자를 맞추셨습니다.");
	}
}
