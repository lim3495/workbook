package workbook.StepI;
import java.util.Scanner;
import java.util.Random;

public class I6 {
	
	private int number[] = new int[10];
	private int count[] = {0,0,0};
	private String s[] = {"대 (70 이상):","중 (40 이상):","소 (40 미만):"};
	private int num_count=0;
	public I6() {
		input();
	}

	void input() {
		
		Random R = new Random();
		
		System.out.println("10개의 숫자를 생성합니다.");
		
		for(num_count = 0; num_count<10 ; num_count++) {
			
			number[num_count] = R.nextInt(100)+1;
			System.out.println("생성된 임의의 숫자는"+number[num_count]+"입니다.");
			count[GetRandom()]++;
			
		}
		
		print();
		
	}
	
	byte GetRandom() {
		
		byte i = 0;
		

			
			if(number[this.num_count] >= 70 ) i = 0;
			else if(number[this.num_count] >= 40) i=1;
			else if(number[this.num_count] < 40) i=2;
		
		
		return i;
		
		
	}
	
	void print() {
		
		for(int i=0 ; i<3 ; i++) {
			System.out.println((i+1)+". "+s[i]+count[i]+"회 생성");
	}
	
	}
}
