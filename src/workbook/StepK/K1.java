package workbook.StepK;
import java.util.Scanner;


class Menupan {
	
	private int number;
	private int price[] = new int[100];
	private String menu[] = new String[100];
	private String from[] = new String[100];
	
	public Menupan() {

	}
	
	void input(int n) {
		
		Scanner s = new Scanner(System.in);
			
		System.out.println((n+1)+"번 메뉴의 번호, 메뉴명, 원산지, 가격을 입력하시오. ");
		this.number = s.nextInt();
		this.menu[n] = s.next();
		this.from[n] = s.next();
		this.price[n] = s.nextInt();
		
		}
	
	void output(int n) {
		
		
		System.out.println(n+1 +"\t"+menu[n]+"\t"+from[n]+"\t"+price[n]);
		
	}
}

public class K1 {
	
	public void main(){
		
		Menupan u = new Menupan();
		u.input(0);
		
		System.out.println("=======================================");
		System.out.println("메뉴번호\t메뉴이름\t원산지\t1인분가격");
		
		u.output(0);
		
	}
	
	
}
