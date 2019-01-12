package workbook.StepJ;
import java.util.Scanner;

public class J2 {
	private double jumsu[] = new double[10];
	private double Max=0.0,Min=100.0;
	private double average = 0.0;
	
	public J2() {
		input();
	}
	
	double Max(double num[]) {
		
		for(int i=0 ; i<10 ; i++) {
			if(num[i] > this.Max)
				Max = num[i];
		}
		
		return Max;
		
	}
	
	double Min(double num[]) {
		
		for(int i=0 ; i<10 ; i++) {
			if(num[i]  < this.Min)
				Min = num[i];
		}
		
		return Min;
		
	}
	
	double GetAverage(double num[]) {
		
		this.Max = Max(num);
		this.Min = Min(num);
		
		double total=0;
		
		
		for(int i=0 ; i<10 ; i++) {
			total += num[i];
		}
		
		total = total -(Max+Min);
		this.average = total / 8.0;
		
		return this.average;
	
	}
		
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println((i+1)+"번 심사점수를 입력하시오.");
			this.jumsu[i] = s.nextDouble();
		}
			
	}
	
	public void printJ2() {
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다.\n",GetAverage(jumsu));
	}

}
