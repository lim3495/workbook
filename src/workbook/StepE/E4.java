package workbook.StepE;
import java.util.Scanner;

public class E4 {
	private int mode;
	
	public E4() {
		input();
	}
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("구구단의 출력모드(1: 홀수단, 2:짝수단)를 입력하시오.\n");
		mode = s.nextInt();
	}
	public void printE4() {
		int i,j;
		if(mode ==1) {
			for(i=3 ; i<10 ; i+=2) {
				for(j=1 ; j<10 ; j++) {
					System.out.print(i+" x "+j+" = "+i*j);
					System.out.print(" ");
					if(j%3==0)
						System.out.println();
				}
				System.out.println();
			}
		}
		else {
			for(i=2 ; i<10 ; i+=2) {
				for(j=1 ; j<10 ; j++) {
					System.out.print(i+" x "+j+" = "+i*j);
					System.out.print(" ");
					if(j%3==0)
						System.out.println();
						
				}	
				System.out.println();
			}
			
		}
	}
	
}
