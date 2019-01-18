package workbook.StepL;
import java.util.*;
import java.text.SimpleDateFormat;

class FoodList{

		ArrayList<FoodList> f = new ArrayList<FoodList>();
		private int member,price;
		private int steak,spagetti,pasta;
		private String membership,date;
		Scanner s = new Scanner(System.in);
		
		public FoodList() {
			
		}
		
		FoodList(int member ,int steak , int spagetti , int pasta, int price, String membership , String date){
			
			this.member = member;
			this.steak = steak;
			this.spagetti = spagetti;
			this.pasta = pasta;
			this.price = price;
			this.membership = membership;
			this.date = date;
			
		}
		
		void add(int member ,int steak , int spagetti , int pasta, int price ,String membership , String date) {
			
			f.add(new FoodList(member,steak,spagetti,pasta,price,membership,date));
			
		}
		
		void output(int n) {
			
			System.out.println(n+1+"\t"+this.member+"\t"+this.steak+"\t"+this.spagetti+"\t"+this.pasta+"\t"+this.membership+"\t"+this.date);
			
		}
		
		void list() {
			
			System.out.println("번호\t손님수\t스테이크\t스파게\t파스타\t멤버쉽\t\t입장시간");
			
			for(int i=0 ; i< f.size(); i++)
				f.get(i).output(i);
		}
		
		void delete() {
			
			int number=0;
			
			System.out.println("==> 결제하실 번호를 입력하세요 : ");
			number = s.nextInt();
			
			f.remove(number-1);
			System.out.println("==> 결제완료되었습니다.");
			
		}
		
		
	
	
}

public class L3 {
	public void main() {
		Scanner s = new Scanner(System.in);
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss", Locale.KOREA);
		int n=0 , customer=0;
		int steak,spagetti,pasta,cost;
		FoodList fd = new FoodList();
		String member;
		
		System.out.println("----------------------------------------------------------------------");
		
		while(true) {
			
			System.out.println("1)주문 2)결제 3)리스트 4)종료 ==>");
			n = s.nextInt();
			System.out.println("----------------------------------------------------------------------");
			
			if(n == 4) {
				
				System.out.println("종료되었습니다.");
				break;
				
			}
			
			else if(n==3) {
				
				fd.list();
					
			}
			
			else if(n==2) {
				
				fd.list();
				fd.delete();
				
			}
			
			else if(n==1) {
				
				System.out.println("손님 수를 입력하세요.");
				customer = s.nextInt();
				
				System.out.println("스테이크,스파게티,파스타의 개수를 입력하세요.");		
				steak = s.nextInt();
				spagetti = s.nextInt();
				pasta = s.nextInt();
				
				System.out.println("멤버쉽 카드가 있습니까?(Y:있음)");
				member = s.next();
				
				cost = steak*25000 + spagetti*15000 + pasta*17000;
				
				if(member.equalsIgnoreCase("Y"))
					cost = (int)(cost*0.9);
				
				if(cost >= 100000)
					cost = (int)(cost*1.1);
				else
					cost = (int)(cost*1.07);
				
				cost = (int)(cost * 1.1);
				
				System.out.println("들어오신 시간은 "+f.format(new Date())+"입니다.");
				System.out.println("총 금액은 " + cost + "입니다.");
				
				fd.add(customer, steak, spagetti, pasta, cost, member, f.format(new Date()));
				
			}
			
			
		}
		
	}

}
