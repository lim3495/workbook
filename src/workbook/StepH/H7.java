package workbook.StepH;
import java.util.Scanner;

public class H7 {
	
	private String input;
	
	public H7() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
			
		while (true) {
			System.out.println("============================");
			System.out.println("=> 문자열을 입력하세요.(x:종료) : ");
			
			input = s.nextLine();
			
			if(input.equals("x")) {
				System.out.println("종료되었습니다.");
				break;
			}
			else {
				get_length();
			}
		}
	
	}
	
	void get_length() {
		int length= input.length();
		System.out.println("=>총 문자의 개수는 "+length+"개 입니다.");
		
		for(int i=0 ; i< length ; i++)
			System.out.println("=>"+input.substring(i, i+1));
	}
		
	
}
