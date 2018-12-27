package workbook.StepF;
import java.util.Scanner;

public class F7 {
	
	private int number[][] = new int[5][3];
	private int floor_total[] = new int[5];
	private int line_total[] = new int[3];
	private int total=0;
	private int newnum;
	
	public F7() {
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
	
	public void printF7() {
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<3 ; j++)
			{
				floor_total[i] += number[i][j];
				line_total[j] += number[i][j];
			}
			
		}
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println((i+1)+"층에 사는 사람은 모두"+floor_total[i]+"입니다.\n");
		}
		for(int i=0 ; i<3 ; i++) {
			System.out.println((i+1)+"호 라인에 사는 거주자는 모두"+line_total[i]+"입니다.\n");
		}
		
	}
	
	

}
