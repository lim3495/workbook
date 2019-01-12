package workbook.StepJ;
import java.util.Scanner;

public class J3 {
	
	private double temp[] = new double[10];
	private int temp_value[] = {0,0,0,0};
	private String s[] = {"냉수","미온수","온수","끓는 물"};
	
	public J3() {
		input();
	}
	
	int AskWater(double temp) {
		int num=-1;
		
		for(int i=0 ; i<10 ; i++) {
			
			if(temp>= 0 && temp <25)
				num=0;
			else if(temp>=25 && temp<40)
				num=1;
			else if(temp>=40 && temp<80)
				num=2;
			else
				num=3;	
		}
		
		
		return num;
		
	}
	
	void get_temp(double temp[]) {
	
		for(int i=0 ; i<10 ; i++) {
			temp_value[AskWater(temp[i])]++;
			System.out.printf("%d번 물의 온도는 %.1f도 입니다.\n",i+1,temp[i]);
		}
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println((i+1)+"번째 물의 온도를 입력하시오.");
			
			temp[i] = s.nextDouble();
			
		}
		
		get_temp(temp);
		

		
	}
	
	public void printJ3() {
		for(int i=0 ; i<4 ; i++) {
			System.out.println(s[i]+" 입력 횟수 " +temp_value[i]+" 입니다.");
		}
	}

}
