package workbook.StepF;
import java.util.Scanner;

public class F9 {
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int month , day;
	private int day_count=0;
	
	public F9() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("월을 입력하시오.");
		month = s.nextInt();
		System.out.print("\n을 입력하시오.");
		day = s.nextInt();
		
		cal_day_count();
	}
	
	void cal_day_count() {
		
		for(int i=0 ; i<(month-1) ; i++ )
			day_count += monthdays[i];
		
		day_count += day;
		
	}
	
	public void printF9() {
		
		if(month <1 || month >12 || day > monthdays[month-1])
			System.out.print("잘못 입력하셨습니다.\n");
		else
			System.out.println("이 날짜는 1년 중"+day_count+"번재 날에 해당됩니다.\n");
			
	}
}
