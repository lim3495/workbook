package workbook.StepC;

import java.util.Scanner;

public class C11 {
	
	private int year;
	
	public C11() {
		input();
	}
	public void printC11() {
		if(year % 4 == 0) {
			
				if(year % 100 == 0) {
					if(year % 400 == 0)
						System.out.println("입력하신 년도는 윤년입니다.\n");
					
					else System.out.println("입력하신 년도는 윤년이 아닙니다.\n");
				
				}
				else System.out.println("입력하신 년도는 윤년입니다.\n");
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("년도를 입력하세요.\n");
		year = s.nextInt();
	}

}
