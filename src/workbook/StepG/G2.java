package workbook.StepG;
import java.util.Scanner;

public class G2 {
	
	private double input_degree;
	private double degrees[] = new double[10];
	private String degree_name[] = {"냉수","미온수","온수","끓는물"};
	private int count[] = {0,0,0,0};
	
	public G2(){
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0; i<10 ; i++) {
			
			System.out.println((i+1)+"번 물의 온도를 입력하시오.");
			
			input_degree = s.nextDouble();
			degrees[i] = input_degree;
			
			if(input_degree <0) {
				System.out.println("잘못 입력하였습니다.");
				i--;
			}
		}
		get_temp();
	}
	
	void get_temp() {
		
		for(int i=0 ; i<10 ; i++) {
			
			if(degrees[i] >=0 && degrees[i] <25) count[0]++;
			else if(degrees[i] >=25 && degrees[i] <40) count[1]++;
			else if(degrees[i] >=40 && degrees[i] <25) count[2]++;
			else if(degrees[i] >=0 && degrees[i] <25) count[3]++;
			
		}		
	}
	
	public void printG2() {
		for(int i=0 ; i<10 ; i++) {
			System.out.printf("%d번 물의 온도는 %.1f도 입니다.\n",(i+1),degrees[i]);
		}
		for(int i=0 ; i<4 ; i++) {
			System.out.println(degree_name[i]+"입력 횟수:"+count[i]);
		}
	}
}
