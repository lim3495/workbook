package workbook.StepF;
import java.util.Scanner;

public class F6 {
	
	private int number[][] = new int[5][3];
	private int total=0;
	private int newnum;
	
	public F6() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<3;j++) {
				
				System.out.println((i+1)+"0"+(j+1)+"호에 살고 있는 사람의 숫자를 입력하시오.\n");
				newnum = s.nextInt();
				number[i][j]=newnum;
			}
			
		}
		
	}
	
	public void printF6() {
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<3 ; j++)
				total += number[i][j];
			
		}
		
		System.out.println("이 아파트에 사는 거주자는 모두"+total+"명 입니다.\n");
		
	}
	
	

}
