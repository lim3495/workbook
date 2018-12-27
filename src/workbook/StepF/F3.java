package workbook.StepF;

import java.util.Scanner;

public class F3 {
	
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[3];
	private double average[] = new double[3];
	private int kor,eng,mat;
	private String s[] = {"국어","영어","수학"};
	
	public F3() {
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
	
	public void printF3() {
		for(int i=0;i<3;i++) {
		System.out.println(s[i]+"의 총점은 "+sum[0]+"이고, 평균은 "+average[0]+"입니다.\n");
		}
	}
	
	void get_sum() {
		
		for(int j=0 ; j<3 ; j++) {
			sum[j] = 0; 
		}
		
		for(int j=0 ; j<3 ; j++) {
			for(int i=0 ; i<5; i++) {
				sum[j] += jumsu[i][j];
			}
		}
		
		
		
	}
	
	void get_ave() {
		
		for(int j =0 ; j<3 ; j++) {
			average[j] = (double)sum[j] / (double)5;
			
		}
		
	}
	
	
}
