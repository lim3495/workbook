package workbook.StepG;
import java.util.Scanner;

public class G3 {
	
	private int jumsu[][] = new int[5][3];
	private int c_average[] = new int[3];
	private int sum[] = new int[5];
	private double average[]= new double[5];
	private String class_name[] = {"국어","수학","영어"};
	
	public G3() {
		input();	
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		for(int i=0 ; i<5 ; i++) {
			System.out.println((i+1)+"번 학생의 국어, 영어, 수학 점수는?");
			for(int j=0 ; j<3 ; j++) {
				jumsu[i][j] = s.nextInt();
				c_average[j] +=jumsu[i][j];
				sum[i] += jumsu[i][j];
			}		
		}
	}
	
	void cal_grade(double ave) {
		if(ave >= 90) 
			System.out.print("A\n");
		else if(ave >=80 && ave <90) 
			System.out.print("B\n");
		else if(ave >=70 && ave <80) 
			System.out.print("C\n");
		else if(ave >=60 && ave <70) 
			System.out.print("D\n");
		else 
			System.out.print("F\n");
	}
	public void printG3() {
		System.out.println("1) 각 과목별 총점과 평균점수");
		
		for(int i=0 ; i<3 ; i++) {
			System.out.printf(class_name[i]+" 과목 총점은"+c_average[i]+" 평균은 %.1f입니다.\n",c_average[i]/5.0);
		}
		System.out.println("2) 각 학생별 총점과 평균점수");
		for(int i=0 ; i<5 ; i++) {
			average[i] = sum[i]/3.0;
			System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급",(i+1),sum[i],sum[i]/3.0);
			cal_grade(average[i]);
		}
	}
	
}
