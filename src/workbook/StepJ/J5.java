package workbook.StepJ;
import java.util.Scanner;

public class J5 {
	
	private int s_h, s_m;
	private int e_h, e_m;
	private int fee , total_fee=0;
	private String check;
	private int count=0;
	
	public J5() {
		input();
	}
	
	int CalcParking(int start_h , int start_m , int end_h , int end_m) {
		
		int start , end;
		count++;
	
		start = start_h*60 + start_m;
		end = end_h*60 + end_m;
		
		fee = ((end - start) / 10 ) *500;	
		
		if(Math.abs(end_m - start_m) > 0) fee += 500;
		
		total_fee += fee;
		return fee;
		
	}
	
	void input() {
		int i=0;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			System.out.println((i+1)+"번 차량 주차 시작 시간(시 / 분)");
			this.s_h = s.nextInt();
			this.s_m = s.nextInt();
			
			
			System.out.println((i+1)+"번 차량 주차 시작 시간(시 / 분)");
			this.e_h = s.nextInt();
			this.e_m = s.nextInt();
			
			this.fee = CalcParking(this.s_h, this.s_m , this.e_h , this.e_m);
			
			System.out.println("주차 요금: "+ fee + "원");
			
			System.out.println("더 입력하시겠습니까? (Y/N)");
			this.check = s.next();
			
			if(check.equalsIgnoreCase("N")) break;
			
		}
		
	}
	
	public void printJ5() {
		
		System.out.println("주차차량 " +count+"대의 총 주차 요금은" +total_fee+"원 입니다.");
	}
	
	
	

}
