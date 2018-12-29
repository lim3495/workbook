package workbook.StepG;
import java.util.Scanner;

public class G5 {
	
	private int hour, minute;
	private int charge, total_charge=0;
	
	public G5() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
				
			System.out.println("사용한 시간을 시간과 분으로 입력하세요.");
			hour = s.nextInt();
			minute = s.nextInt();
			if(hour == 0 && minute == 0) break; 
			
			cal_fee();
			System.out.println("고객님의 이용료는"+charge+"입니다.");
		}
	}
	
	void cal_fee() {
		
		int total_minute = hour * 60 + minute;
		
		if(total_minute % 30 == 0) 
			charge = (total_minute/30) * 1000;
		else
			charge = (total_minute/30 + 1) * 1000;
		
		if(hour >= 2 && hour <3)
			charge = (int)(charge - charge*0.05);
		else if(hour >=3 && hour<5)
			charge = (int)(charge - charge*0.10);
		else 
			charge = (int)(charge - charge*0.20);
		
		
		total_charge += charge;
		
	}
	
	public void printG5() {
		
		System.out.println("지금까지의 이용료 총금액은"+total_charge+"원 입니다.");
		
		
	}
	

}
