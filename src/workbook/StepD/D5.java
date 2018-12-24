package workbook.StepD;

import java.util.Scanner;

public class D5 {
	
	private int width, height;
	private int count1,count2,count3,count4,count5;
	
	public D5() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n직사각형의 가로 크기와 세로 크기를 입력하시오. :");
			width = s.nextInt();
			height = s.nextInt();
			
			if(width<=0 || height <=0) break;
			
			test_square();
		}//while
		
	}
	
	void test_square() {
		
		if(width == height) count1++;
		else if(width >= height*2) count2++;
		else if(width*2 <= height) count3++;
		else if(width > height) count4++;
		else if(width < height) count5++;
	}
	
	public void printD5() {
		System.out.println("[정사각형]의 개수는"+count1+"입니다.\n");
		System.out.println("[좌우로 길쭉한 직사각형]의 개수는"+count2+"입니다.\n");
		System.out.println("[위아래로 길쭉한 직사각형]의 개수는"+count3+"입니다.\n");
		System.out.println("[일반적인 가로형 직사각형]의 개수는"+count4+"입니다.\n");
		System.out.println("[일반적인 세로형 직사각형]의 개수는"+count5+"입니다.\n");
	}

}
