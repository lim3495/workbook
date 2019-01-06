package workbook.StepI;
import java.util.Scanner;

public class I4 {
	
	private int menu;
	private int total_price=0;
	
	public I4() {
		getdata();
	}
	
	void ShowMenu() {
			
			System.out.println("1. 피자(15,000원) 2.스파게티(10,000원) 3.샐러드(7,000원) 4.음료수(2,000원)");
	
		}
	
	void getdata() {
		
		
		while(true) {
			
			ShowMenu();
			menu = SelectMenu();
			
			if(menu == -1)
				break;
			
			total_price += menu;
			System.out.println("현재까지의 주문 금액은"+total_price+"입니다.");
			
			
			
			
		}
		
		System.out.println("\n총 주문 금액은"+total_price+"입니다.");
	}
	
	
	int SelectMenu() {
		
		Scanner s = new Scanner(System.in);
		int price[] = {15000,10000,7000,2000};
		
		System.out.println("메뉴를 선택해주세요. (종료 : 5)");
		menu = s.nextInt();
		
		if(menu == 5)
			return -1;
		
		return price[menu-1];
		
		
		
	}
	

}
