package workbook.StepJ;
import java.util.Scanner;

public class J7 {
	
	private int num=0;
	
	public J7() {
		input();
	}
	
	int poweroftwo(int num) {
		
		
		if(num == 0) return 1;
		else {
			return 2*poweroftwo(num-1);
		}
		
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("숫자를 입력하시오. (0 : 종료)");
			this.num = s.nextInt();
			
			if(num == 0) break;
			
			System.out.println("2의 " + num +"승은 :"+poweroftwo(num));
			
			
		}
	}
	
	

}
