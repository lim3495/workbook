package workbook.StepE;
import java.util.Scanner;

public class E1 {
	
	private int length;
	
	public E1() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("정사각형의 크기를 입력하시오.\n");
		this.length = s.nextInt();
		
	}
	
	public void printE1() {
		int i,j;
		for(i=0 ; i<this.length ; i++) {
			for(j=0 ; j<this.length ; j++) {
				System.out.print("# ");
			}
			System.out.print("\n");
		}
		
	}
	
	


}
