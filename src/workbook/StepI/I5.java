package workbook.StepI;
import java.util.Scanner;

public class I5 {

	private int max=0;
	private int number[] = new int[10];
	
	public I5() {
		getnumber();
	}
	
	void getnumber() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("10개의 숫자 중 최댓값을 구합니다.");
		for(int i=0 ; i<10 ; i++) {
			System.out.println((i+1)+"번 수를 입력하시오.");
			number[i] = s.nextInt();
		}
		
		max = MaxOfTen();
		System.out.println("최댓값은 "+max+"입니다.");
	}
	
	int MaxOfTen() {
		for(int i=0 ; i<10 ; i++) {
			if(number[i] > max)
				max = number[i];
		}
		
		return max;
		
	}
}
