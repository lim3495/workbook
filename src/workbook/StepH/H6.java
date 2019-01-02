package workbook.StepH;
import java.util.Scanner;

public class H6 {

	private int number[] = new int[5];
	private int pow_value[][] = new int[5][5];
	private int max=0,min=100000000;
	private int max_a=0 , max_b =0;
	private int min_a=0, min_b=0;
	
	public H6() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("2에서 9사이의 숫자 5개를 입력하세요.");
		
		for(int i=0 ; i<5 ; i++) {
			number[i] = s.nextInt();
		}
		System.out.println("입력하신 5개의 수로 제곱수를 만들면 ㅡ");
		cal_number();
		get_max();
		get_min();
	}
	
	void cal_number() {
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0; j<5 ; j++) { 
				if(i != j){
					pow_value[i][j] = (int)Math.pow(number[i],number[j]);
				}
			}
		}
		
	}
	
	void get_max() {
		for(int i=0 ; i<5; i++) 
			for(int j=0 ; j<5 ; j++) 
				if(i != j){
						if(max < pow_value[i][j]) {
							
								max = pow_value[i][j];
								max_a = number[i];
								max_b = number[j];
						}
			}
		
		
	}
	void get_min() {
		for(int i=0 ; i<5 ; i++) 
			for(int j=0 ; j<5 ; j++) 
				if( i != j){
						if(min > pow_value[i][j]) {
							
								min = pow_value[i][j];
								min_a = number[i];
								min_b = number[j];
						}
			}
		
	}
	
	public void printH6() {
		System.out.println("");
		System.out.println("가장 큰 수는 "+max_a+"의"+max_b+"승인 "+max+"입니다.");
		System.out.println("가장 큰 수는 "+min_a+"의"+min_b+"승인 "+min+"입니다.");
	}
	
	
}
