package workbook.StepE;
import java.util.Scanner;

public class E2 {

	private int height,blank;
	
	public E2() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오.\n");
		height = s.nextInt();
		blank = s.nextInt();
	}
	
	public void printE2() {
		int i,j;
		int star_num=1;
		while(star_num<=height) {
		for(i = 2*blank-star_num ; i > 0 ;i--) System.out.print(" ");
		for(j = 0 ; j<star_num;j++) System.out.print("*");
		System.out.print("\n");
		star_num++;
			
		}
	}
		
		
}
