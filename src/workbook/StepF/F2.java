package workbook.StepF;
import java.util.Scanner;

public class F2 {
	
	private double score[] = new double[10];
	private double average = 0;
	
	public F2() {
		input();
	}
	
	void input() {
		

		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<10 ;i++) {
			System.out.println((i+1)+"번 심사점수를 입력하시오.\n");
			score[i] = s.nextDouble();

		}
		cal_num(score);
		
	}
	
	double cal_num(double score[]){
		
		double maxscore = score[0];
		double minscore =score[0];
		double total = 0;
		
		for(int i=0; i<10 ; i++) {
			if(maxscore < score[i]) maxscore = score[i];
			if(minscore > score[i]) minscore = score[i];
			
			total += score[i];
		}
			
		total = total -(minscore+maxscore);
		average = total/8;
		
		return average;
		
		
	}
	
	public void printF2() {
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f입니다.\n",average);
	}
}
