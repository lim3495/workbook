package workbook.StepF;

import java.util.Scanner;

public class F8 {
	
	private int number[] = new int[10];
	private int newnum=0,count=0;
	private boolean dup;
	
	public F8() {
		input();
	}
	
	public void printF8() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println((i+1)+"번째 숫자는"+number[i]+"입니다.\n");
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1부터 100사이의 숫자를 입력하시오.\n");
		for(int i=0 ; i<10 ; i++) {
			
			System.out.println((i+1)+"번째 숫자를 입력하시오.");
			newnum = s.nextInt();
			number[i] = newnum;
			num_test();
			
			if(dup == true) {
				i--;
				System.out.print("잘못 입력하였습니다. 다시입력하세요.\n");
			
			}
			else count++;
			
		}
	}
	
	void num_test() {
		for(int i=0 ; i<count ; i++) {
			if(number[i] == number[count]) {
				dup = true;
				break;
			}
			else
				dup = false;
		}
	}
}


