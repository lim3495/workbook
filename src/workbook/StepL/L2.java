package workbook.StepL;

import java.text.*;
import java.util.*;

class ParkingList{
	
	private String name,date;
	private int number,price;
	Scanner s = new Scanner(System.in);
	ArrayList<ParkingList> p = new ArrayList<ParkingList>();
	
	ParkingList(int number , String name , String date){

		this.number = number;
		this.name = name;
		this.date = date;
			
	}
	
	public ParkingList() {
		
	}
	
	void add(int number , String name , String date){
		
		p.add(new ParkingList(number,name,date));
		
	}
	
	void output(int i) {
		
		System.out.println((i+1)+"\t"+this.number+"\t"+this.name+"\t"+this.date);
		
	}
	
	void list() {
		
		for(int i=0 ; i < p.size() ; i++) {
			
			p.get(i).output(i);
			
		}
	}
	
	void delete () throws ParseException {
		
		int n=0,min=0;
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss", Locale.KOREA);
		System.out.println("==> 출차 번호를 입력하세요 : ");
		n = s.nextInt();
		
		Date b = f.parse(p.get(n-1).date);
		Date a = f.parse(f.format(new Date()));
		long time = a.getTime() - b.getTime();
		
		p.remove(n-1);
		
		min = (int) (time / (60*1000));
		
		if(min/10 == 1)
			this.price = 0;
		else
			this.price = (min/10)*500;
		
		System.out.println("==> 현재 시간은 "+ f.format(new Date()) +"이므로 주차금액은 "+this.price+"원 입니다.");
		
	}
	
	
	
}


public class L2 {
	public void main() throws ParseException {
		
		Scanner s = new Scanner(System.in);
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss", Locale.KOREA);
		
		int count=0, n=0 , total_car=0;
		
		ParkingList p = new ParkingList();
		
		System.out.println("주차할 수 있는 차의 개수를 입력하세요 : ");
		count = s.nextInt();
		System.out.println("총 "+count+"대를 주차할 수 있습니다.");
		
		
		while(true) {
			
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1) 입차 2) 출차 3) 리스트 4)입차 총개수 5)주차잔여개수 6)종료 ==> ");
			n = s.nextInt();
			System.out.println("----------------------------------------------------------------------");
			
			if(n == 6) {
				
				System.out.println("종료되었습니다.");
				break;
				
			}
			
			else if(n == 5) {
				
				System.out.println("주차 가능한 자리는"+(count)+"대 입니다.");
				
				
			}
			
			else if(n == 4) {
				
				System.out.println("총" + total_car +"대가 주차 되어 있습니다.");
				
			}
			
			else if(n == 3) {
				
				p.list();
				
				
			}
			
			else if(n == 2) {
				p.list();
				
				p.delete();
				
				total_car--;
				
			}
			
			else if(n == 1 && count !=0) {
				
				System.out.println("입력할 차의 번호와 차종을 입력하세요.");
				p.add(s.nextInt(), s.next(), f.format(new Date()));
				
				p.list();
				System.out.println(" 입차 되었습니다.");
				
				count--;
				total_car++;
				
			}
			
			
			
			
		}
	}

}
