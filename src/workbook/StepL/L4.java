package workbook.StepL;

import java.util.*;

class StudentList{
	
	ArrayList<StudentList> s = new ArrayList();
	Scanner a = new Scanner(System.in);
	
	private int id;
	private String name,f_m,t_f,address,phone;
	
	public StudentList() {
		
	}
	
	StudentList(String name,int id,String f_m,String address,String phone,String t_f){
		
		this.name = name;
		this.id = id;
		this.f_m = f_m;
		this.address = address;
		this.phone = phone;
		this.t_f = t_f;
	}
	
	void add(String name,int id,String f_m,String address,String phone,String t_f) {
		
		s.add(new StudentList(name,id,f_m,address,phone,t_f));
	}
	
	void edit() {
		int e_num=0;
		
		int id;
		String name,f_m,t_f,address,phone;
		
		System.out.println("==> 수정하실 번호를 입력하세요 : ");
		e_num = a.nextInt();
		
		System.out.println("학생이름, 학번, 성별을 입력하세요 : ");
		name = a.next();
		id = a.nextInt();
		f_m = a.next();
		
		System.out.println("주소를 입력하세요 : ");
		a.nextLine();
		address = a.nextLine();
		
		System.out.println("전화번호를 입력하세요 : ");
		phone = a.next();
		
		System.out.println("복학생 입니까? (Y/N)");
		t_f = a.next();
		
		s.set(e_num-1, new StudentList(name,id,f_m,address,phone,t_f));
		
		
	}
	
	void delete() {
		
		int d_num=0;
		String or;
		
		System.out.println("==> 삭제하실 번호를 입력하세요 : ");
		d_num = a.nextInt();
		
		System.out.println("정말로 삭제하시겠습니까? (Y/N)");
		or = a.next();
		
		if(or.equalsIgnoreCase("Y")) {
			
			s.remove(d_num-1);
			System.out.println("삭제되었습니다.");
		}
		
		
	}
	
	void output(int i) {
		
		System.out.println(i+1+"\t"+this.name+"\t"+this.id+"\t"+this.f_m+"\t"+this.address+"\t\t"+this.phone+"\t\t"+this.t_f);
		
	}
	
	void list() {
		
		System.out.println("이름\t학번\t성별\t주소\t\t전화번호\t\t복학생");
		
		for(int i=0 ; i < s.size() ; i++) {
			s.get(i).output(i);
		}
		
	}
	
	void namesearch() {
		
		String search;
		
		System.out.println("검색하실 이름을 입력하세요 : ");
		search = a.next();
		
		System.out.println("번호\t이름\t학번\t성별\t주소\t\t전화번호\t\t복학생");
		for(int i=0 ; i < s.size() ; i++) {
			if(s.get(i).name.equals(search)) {
				s.get(i).output(i);
			}
		}
		
	}
	
	
	void bokaklist() {
		
		int count=0;
		
		String check = "Y";
		System.out.println("번호\t이름\t학번\t성별\t주소\t\t전화번호\t\t복학생");
		
		for(int i=0 ; i< s.size() ; i++) {
			if(s.get(i).t_f.equals(check)) {
				s.get(i).output(i);
				count++;
			}
		}
		
		System.out.println("복학생은 "+count+"명 입니다.");
		
	}
	
	void addsearch() {
		
		String search;
		
		System.out.println("검색하실 주소를 입력하세요 : ");
		a.nextLine();
		search = a.nextLine();
		
		System.out.println("번호\t이름\t학번\t성별\t주소\t\t전화번호\t\t복학생");
		for(int i=0 ; i < s.size() ; i++) {
			if(s.get(i).address.equals(search)) {
				s.get(i).output(i);
			}
		}
		
	}
	
}

public class L4 {
	public void main() {
		Scanner s = new Scanner(System.in);
		StudentList ss = new StudentList();
		int check=0,count=0;
		
		int id;
		String phone;
		String name,f_m,t_f,address;
		
		while(true) {
			
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("1) 학생등록 2) 정보수정 3)삭제 4)리스트 5)이름검색 6)복학생리스트 7)주소검색 8)종료 ==>");
			check = s.nextInt();
			System.out.println("-------------------------------------------------------------------------------------------------");
			
			if(check == 8) {
				
				System.out.println("종료되었습니다.");
				break;
			}
			
			else if(check == 1) {
				
				System.out.println("학생이름, 학번, 성별을 입력하세요 : ");
				name = s.next();
				id = s.nextInt();
				f_m = s.next();
				
				System.out.println("주소를 입력하세요 : ");
				s.nextLine();
				address = s.nextLine();
				
				System.out.println("전화번호를 입력하세요 : ");
				phone = s.next();
				
				System.out.println("복학생 입니까? (Y/N)");
				t_f = s.next();
				
				count++;
				System.out.println("총 "+count+"명이 등록되었습니다.");
				
				ss.add(name, id, f_m, address, phone, t_f);
				
			}
			else if(check == 2) {
				
				ss.list();
				ss.edit();
							
			}
			else if(check == 3) {
				
				ss.delete();
				
			}
			else if(check == 4) {
				
				ss.list();
				
			}
			else if(check == 5) {
				
				ss.namesearch();
				
			}
			else if(check == 6) {
				
				ss.bokaklist();
				
			}
			else if(check == 7) {
				
				ss.addsearch();
				
			}
			
		
		
		}
	}
	
	
	
	

}
