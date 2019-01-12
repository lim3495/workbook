package workbook.StepK;
import java.util.Scanner;

public class K4 {
	private int n=0;
	Scanner s = new Scanner(System.in);
	
	public void main() {
		get_num();
		
		point p = new point();
			
		for(int i=0 ; i<n ; i++)	
			p.input(i);
		
		System.out.println("=========================");
		for(int i=0 ; i<n ; i++)
			p.output(i);
		
		p.print();
			
	}
	
	void get_num() {
		
		System.out.println("몇 개의 좌표를 입력하시겠습니까?");
		n = s.nextInt();
	}
	

}
