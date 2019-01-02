package workbook.StepF;
import java.util.Scanner;

public class F1 {
	
	private int num[] = new int[10];
	private int first,second;
	private int second_max_index;

	
	public F1() {
		input();
	}
	void input() {
		int newnum;
	
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+"번째 수를 입력하시오.\n");
			newnum = s.nextInt();
			num[i]=newnum;
		}
		num_test(num); 
		
	}
	
	void num_test(int[] num) {
		
		first=num[0];
		second=num[0];
		
		second_max_index=0;
		
		for(int i=0 ; i< 10; i++) {
			if(num[i]>first) {
				second=first;
				first=num[i];
				second_max_index=i;
			}
			else if(first > num[i] && num[i] > second) {
				second=num[i];
				second_max_index=i;
			}
		}
		
	}
	
	public void printF1() {
		System.out.println("두 번째로 큰 수는"+second_max_index+"번째 수"+second+"입니다.\n");
	}

}
