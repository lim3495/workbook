package workbook.StepF;

import java.util.Scanner;

public class F4 {
	
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[5];
	private double average[] = new double[5];
	private int kor,eng,mat;
	
	public F4() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
				System.out.println((i+1)+"번 학생 국어,영어,수학 점수를 입력하시오.");
				
				kor = s.nextInt();
				eng = s.nextInt();
				mat = s.nextInt();
				
				jumsu[i][0] = kor;
				jumsu[i][1] = eng;
				jumsu[i][2] = mat;

		}
		
		get_sum();
		get_ave();
		
	} //input
	
	public void printF4() {
		
		for(int i=0 ; i<5; i++) {
			System.out.printf((i+1)+"번 학생의 총점은"+sum[i]+"이고, 평균은 %.1f입니다.\n",average[i]);
		}
		
	}
	
	void get_sum() {
		
		for(int j=0 ; j<5 ; j++) {
			sum[j] = 0; 
		}
		
		for(int j=0 ; j<5 ; j++) {
			for(int i=0 ; i<3; i++) {
				sum[j] += jumsu[j][i];
			}
		}
		
		
		
	}
	
	void get_ave() {
		
		for(int j =0 ; j<5 ; j++) {
			average[j] = (double)sum[j] / (double)3;
			
		}
		
	}
	
	
}
