package workbook.StepJ;
import java.util.Scanner;

public class J4 {
	
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int f_day, f_month;
	private int s_day, s_month;
	
	private int f_count=0,s_count=0;
	private int countdays = 0;
	
	public J4() {
		input();
	}
	
	int CalcDate(int month , int day) {
		int days=0;
		
		for(int i=0 ; i< month -1 ; i++)
			days += this.monthdays[i];
		
		
		return days+day;
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 날짜를 입력하시오. (월 / 일)");
		this.f_month = s.nextInt();
		this.f_day = s.nextInt();
		
			this.f_count = CalcDate(this.f_month,this.f_day);
		
		
		
		System.out.println("두번째 날짜를 입력하시오. (월 / 일)");
		this.s_month = s.nextInt();
		this.s_day = s.nextInt();
		
		if(this.s_month<1 || this.s_month>12 || (this.s_month ==2 && this.s_day>28) || this.s_day>31 || this.s_day <1)
			System.out.print("잘못 입력하셨습니다.\n");
		else {
			this.s_count = CalcDate(this.s_month,this.s_day);
			
			printJ4();
		}
		

	}
	
	public void printJ4() {
		
		this.countdays = Math.abs(this.f_count - this.s_count);
		
		System.out.println("두 날짜의 간격은 "+ countdays + " 입니다.");

		
	}

}
