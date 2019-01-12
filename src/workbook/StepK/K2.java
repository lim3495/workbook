package workbook.StepK;
import java.util.Scanner;


public class K2 {
	
	public void main(){
		Scanner s = new Scanner(System.in);
		Menupan u = new Menupan();
		int count =0;
		
		System.out.println("등록하실 메뉴의 개수를 입력하세요.");
		count = s.nextInt();
		for(int i=0 ; i<count ; i++)
			u.input(i);
		System.out.println("=======================================");
		System.out.println("메뉴번호\t메뉴이름\t원산지\t1인분가격");
		
		for(int i=0 ; i<count ; i++)
			u.output(i);
		
	}
	
	
}
