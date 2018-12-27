package workbook.StepF;
import java.util.Scanner;

public class F5 {
	

	private int bmilist[][] = new int[10][3];
	private double bmi;
	private int count=0;
	public F5() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			
			System.out.println((i+1)+"번째 사람의 신장(cm)과 체중(kg)을 입력하시오.\n");
							
				bmilist[i][0] = s.nextInt(); //신장
				bmilist[i][1] = s.nextInt(); //체중
				bmi= (double)bmilist[i][1] / (double)((bmilist[i][0]*0.01)* (bmilist[i][0]*0.01));
				
				if(bmi>=25) {
					System.out.println((i+1)+"번째 사람이 비만입니다.\n");
					count++;
				}
				bmilist[i][2]=(int)bmi;
			
		}
		
	}
	
	public void printF5() {
		
		
		System.out.printf("총 %d명의 사람이 비만입니다.\n",count);
		
	}
	

}
