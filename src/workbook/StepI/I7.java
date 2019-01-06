package workbook.StepI;
import java.util.Scanner;

public class I7 {
	
	private int menu;
	private int price[] = {700,300,1000,500,600};
	private int total_price = 0;
	private int count=0;

	
	public I7() {
	
			GetMenu();	
		
	}
	
	void ShowMenu() {
		
		System.out.println("1.콜라(700원) 2.원두커피(300원) 3.레몬주스(1000원) "
				+ "\n4.홍차(500원) 5.코코아(600원)");
		
	}
	int SelectCan() {
		
		int i=0;
		
		if(menu == 1)
			i=0;
		else if(menu == 2)
			i=1;
		else if(menu == 3)
			i=2;
		else if(menu == 4)
			i=3;
		else if(menu == 5)
			i=4;
		
		return price[i];
		
			
		
	}
	void GetMenu() {
		
		Scanner s = new Scanner(System.in);
		String check;
		
		while(true) {
	
			ShowMenu();
			
			System.out.println("메뉴를 선택해주세요.");
			menu = s.nextInt();
			this.total_price += SelectCan();
			count++;
			
			System.out.println("더 필요하십니까?(Y/N)");
			check = s.next();
			
			if(check.equalsIgnoreCase("N"))
				break;
		}
		
		print();
		
	}
	
	void print() {
		
		System.out.println(count+"개의 음료를 선택하여 총 "+total_price+"원 입니다.");
		
	}
	


}
