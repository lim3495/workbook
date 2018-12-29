package workbook.StepG;
import java.util.Scanner;

public class G6 {
	
	private int order[] = {0,0,0};
	private int sale=0;
	private int total_sale=0;
	private int price[] = {10000,6000,3000};
	
	public G6() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("세 종류의 제품이 있습니다.");
		System.out.println("(1.가죽장갑 1만원, 2.털장갑 6천원, 3.비닐장갑 3천원");
		
		while(true) {
			
			for(int i=0 ; i<3 ; i++) {
				
			System.out.println((i+1)+"번 제품은 몇개 구입하실래요?");
			order[i] = s.nextInt();
			}
			
			if(order[0]==0 && order[1]==0 && order[2]==0)
				break;
			
			cal_price();
			System.out.println("판매 금액은"+sale+"입니다.");
		}
	}
	
	void cal_price() {
		sale=0;
		for(int i=0 ; i<3 ; i++) {
			sale += order[i]*price[i];
		}
		
		total_sale += sale;
	}
	
	public void printG6() {
		System.out.println("지금까지의 총 매출금액은"+total_sale+"원 입니다.");
	}
	

}
