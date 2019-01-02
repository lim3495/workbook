package workbook.StepH;
import java.util.Scanner;

public class H8 {
	
	private String input;
	private String findStr;
	private String replaceStr;
	
	public H8() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("============================");
			System.out.println("=> 문자열을 입력하세요(x: 종료) : ");
			
			this.input = s.nextLine();
			
			if(input.equals("x")){
				
				System.out.println("종료되었습니다.");
				break;
				
			} 
			else {
				
				System.out.println("=> 찾을 문자열을 입력하세요 : ");
				this.findStr = s.nextLine();
				
				System.out.println("=> 바꿀 문자열을 입력하세요 : ");
				this.replaceStr = s.nextLine();
				
				input = input.replace(findStr, replaceStr);
				printH8();
			}
		}
	}
	
	public void printH8() {
		int count=0;
		
		for(int i = 0 ; i < input.length()-replaceStr.length()+1; i++) {
			if(input.subSequence(i, i+replaceStr.length()).equals(replaceStr))
				count++;
		}
		
		System.out.println("=> 총 "+count+"번 바뀌었습니다.");
		System.out.println("=> "+input);
	}
}
