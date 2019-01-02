package workbook.StepH;
import java.util.Scanner;
import java.util.Random;

public class H3 {
	
	private int lotto_com[] = new int[6];
	private int lotto_user[] = new int[6];
	private int match_count=0;
	
	public H3() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		
		for(int i=0 ; i<6 ; i++) {
			this.lotto_com[i] = rand.nextInt(45)+1;
		}
		
		for(int i=0 ; i<6 ; i++) {
			System.out.println("원하는"+(i+1)+"번째 로또 숫자를 입력하세요.");
			this.lotto_user[i] = s.nextInt();

			
			for(int j=0 ; j<i ; j++) {
				if(lotto_user[i] == lotto_user[j] || lotto_user[i] > 45 || lotto_user[i]<=0) {
					System.out.println("=> 잘못 입력하셨습니다.");
					i--;
					break;
				}
			}
			
		}
	}
	
	public void printH3() {
		System.out.print("이번 주의 로또 당첨 번호는 ");
		for(int i=0 ; i<6 ; i++) {
			System.out.print(this.lotto_com[i]+" ");
			if(this.lotto_com[i] == this.lotto_user[i])
				match_count++;
		}
		System.out.println("입니다.");
		
		System.out.println("일치하는 로또 번호는 "+match_count+"개 입니다.");
		
	}
}
