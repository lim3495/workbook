package workbook.StepE;
import java.util.Scanner;

public class E5 {
	private int mode,column;
	
	public E5() {
		input();
	}
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("구구단의 출력모드(1: 홀수단, 2:짝수단)를 입력하시오.\n");
		mode = s.nextInt();
		System.out.print("한 줄에 출력할 갯수를 입력하시오.\n");
		column = s.nextInt();
	}
	public void printE5() {
		int i,j;
		if(mode ==1) {
			mode=3;
		}
		else {
			for(i= mode; i<10 ; i+=2) {
				for(j=1 ; j<10 ; j++) {
					System.out.print(i+" x "+j+" = "+i*j);
					System.out.print(" ");
					if(j%column==0)
						System.out.println();
						
				}	
				System.out.println();
			}
			
		}
	}
	
}
