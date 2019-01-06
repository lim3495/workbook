package workbook.StepI;
import java.util.Scanner;

public class I1 {
	
	private int menu,price=0;
	
	public I1() {
		
		while(true) {
			
			ShowMenu();
			GetMenu();
			
			if(menu == 5)
				break;
			
		}
		
		System.out.println("\n총 주문 금액은"+price+"입니다.");
		
		
		
	}
	
	void ShowMenu() {
		
		System.out.println("1. 피자(15,000원) 2.스파게티(10,000원) 3.샐러드(7,000원) 4.음료수(2,000원)");

	}
	
	void GetMenu() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("메뉴를 선택해주세요. (종료 : 5)");
		menu = s.nextInt();
		
		if( menu==1 ) 
			price += 15000;
		else if( menu ==2 )
			price += 10000;
		else if( menu ==3 )
			price += 7000;
		else if( menu ==4 )
			price += 2000;
		else if( menu == 5)
			return;
		
		System.out.println("현재까지의 주문 금액은 "+price+"원 입니다.");
		
	}

	

}
