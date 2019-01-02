package workbook.StepH;
import java.util.Scanner;

public class H9 {
	
	private String input;
	private String userList[] = new String[1000];
	private String userInfo[] = new String[1000];
	private int count=0;

	public H9() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("============================");
			System.out.println("=> 문자열을 입력하세요. (x: 종료) :");
			this.input = s.nextLine();
			
			if(this.input.equals("x")) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			
			get_into();
			
			
		}
	}
	
	void get_into() {
		
		int index=0;
		String s[] = input.split("###");
		
		for(int i=0 ; i < s.length ; i++) {
			
			count++;
			index = s[i].indexOf("|");
			
			this.userInfo[i] = s[i].substring(0,index);
			this.userList[i] = s[i].substring(index+1,s[i].length());	
		}
		 printH9();
		
	}
	
	public void printH9() {
		System.out.println("=> 총 "+count+"명이 등록되었습니다.");
		
		for(int i=0 ; i<count ; i++) {
			System.out.println((i+1)+" "+this.userList[i]+" "+this.userInfo[i]);
		}
	}

}
