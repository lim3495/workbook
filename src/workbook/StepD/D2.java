package workbook.StepD;

import java.util.Scanner;

public class D2 {
	
	private int number=0;
	private int max_num=0,min_num=99;
	
	public D2() {
		input();
	}

	void input() {
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("\n0부터 100 사이의 숫자를 입력하세요.");
			number = s.nextInt();
			if(number <0 || number >100) break;
			
			num_test();
		} //while
	}
	
	void num_test() {
		
		if(max_num < number) max_num = number;
		if(min_num > number) min_num = number;
		
	}
	
	
	public void printD2() {
		
		System.out.printf("입력 된 숫자들 중 가장 큰 수는 %d 이고, 가장 작은 수는 %d 입니다.",max_num,min_num);
	}
	
	
}
