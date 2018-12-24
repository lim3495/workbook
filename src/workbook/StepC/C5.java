package workbook.StepC;

import java.util.Scanner;

public class C5 {
	
	private int month,day;
	private int day_count;
	
	public C5() {input();}
	public void printC5() {
	
		System.out.println("이 날짜는 1년 중,"+cal_days()+"번째 날에 해당됩니다.\n");
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("월을 입력하시오.\n");
		month = s.nextInt();
		System.out.println("일을 입력하시오.\n");
		day = s.nextInt();	
	}
	
	int cal_days() {
		if(month == 1)
			day_count = day;
		else if(month == 2)
			day_count = day + 31;
		else if(month == 3)
			day_count = day+31+28;
		else if(month == 4)
			day_count = day+31+28+31;
		else if(month == 5)
			day_count = day+31+28+30;
		else if(month == 6)
			day_count = day+31+28+30+31;
		else if(month == 7)
			day_count = day+31+28+30+31+30;
		else if(month == 8)
			day_count = day+31+28+30+31+30+31;
		else if(month == 9)
			day_count = day+31+28+30+31+30+31+31;
		else if(month == 10)
			day_count = day+31+28+30+31+30+31+31+30;
		else if(month == 11)
			day_count = day+31+28+30+31+30+31+31+30+31;
		else if(month == 12)
			day_count = day+31+28+30+31+30+31+31+30+31+31;
		
		return this.day_count;

	}
}
