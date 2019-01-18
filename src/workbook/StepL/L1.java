package workbook.StepL;
import java.util.Scanner;
import java.util.ArrayList;


class MenuList{
	
	Scanner s = new Scanner(System.in);
	ArrayList<MenuList> m = new ArrayList<MenuList>();
	
	private String menu,from;
	private int price=0;
	
	
	MenuList(String menu , String from, int price){
		
		this.menu = menu;
		this.from = from;
		this.price = price;
		
	}
	
	public MenuList() {
		
	}
	
	void add(String menu , String from, int price) {
		
		m.add(new MenuList(menu,from,price));
		
	}
	
	void edit() {
		
		int number=0;
		
		System.out.println("==> 수정할 번호를 입력하세요 : ");
		number = s.nextInt();
		
		System.out.println("==> 메뉴의 메뉴명, 원산지, 가격을 입력하시오. ");		
		m.set(number-1, new MenuList(s.next() , s.next() , s.nextInt()));
		
	}
	
	void delete() {
		
		int number=0;
		
		System.out.println("==> 삭제할 번호를 입력하세요 : ");
		number = s.nextInt();
		
		m.remove(number-1);
		
	}
	
	void output_print(int i) {
		System.out.println((i+1)+"\t"+this.menu+"\t"+this.from+"\t"+this.price);
	}
	
	void show() {
		
		System.out.print("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		
		for(int i=0 ; i< m.size() ; i++) {
			m.get(i).output_print(i);
		}
		
	}
	
	
}

public class L1 {
	public void main() {
		
		Scanner s = new Scanner(System.in);
		MenuList m = new MenuList();
		int menu=0,count=0;
		
		while(true) {
		
		System.out.println("1)추가 2)수정 3)삭제 4)리스트 5)총개수 6)종료 ==>");
		menu = s.nextInt();
		
		System.out.println("----------------------------------------------------------------------");
		
		if(menu == 6) {
	
			System.out.println("종료되었습니다.");
			break;
		}
		
		else if(menu == 5) {
			
			System.out.println("총 "+count+"개의 메뉴가 등록되어 있습니다.");
			
		}
		else if(menu == 4) {
			
			m.show();
			
		}
		
		else if(menu == 3) {
			
			m.delete();
			System.out.println("수정 완료");
			count--;
			

		}
		
		else if(menu == 2) {
			
			m.show();
			m.edit();
			
			System.out.println("수정 완료");

		}
		
		else if(menu == 1) {
			
			System.out.println("메뉴의 메뉴명, 원산지, 가격을 입력하시오.");
			m.add(s.next(), s.next() , s.nextInt());
			
			System.out.println("입력되었습니다.");
			count++;

		}
			
			
		}
		
	}

}
