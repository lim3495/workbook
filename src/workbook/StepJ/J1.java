package workbook.StepJ;
import java.util.Scanner;

public class J1 {
	
	private int b_year=0;
	private int age[]= {0,0,0,0,0,0};
	private String name[] = {"유아","어린이","청소년","청년","중년","노년"};
	
	public J1() {
		input();
	}

	int AskAge(int birthyear) {
		
		int num=0,age_=0;
		
		age_ = 2014 - birthyear +1;
		System.out.println("나이는 "+age_+" 입니다.");
		
		if(age_ < 7)
			num=0;
		else if(age_ < 13 && age_ >= 7)
			num=1;
		else if(age_ < 20 && age_ >= 13)
			num=2;
		else if(age_ < 30 && age_ >= 20)
			num=3;
		else if(age_ < 60 && age_ >= 30)
			num=4;
		else 
			num=5;
		
		
		
		return num;
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int i=0;
			System.out.println((i+1)+"번째 사람의 태어난 년도를 입력하시오.");
			this.b_year = s.nextInt();
			
			if(this.b_year > 2013) break;
			
			age[AskAge(b_year)]++;
			i++;
			
		}
		
	}

		
	
	
	public void printJ1() {
		for(int i=0 ; i<6 ; i++) {
			System.out.println(this.name[i]+"는"+this.age[i]+"명 입니다.");
		}
	}
}
