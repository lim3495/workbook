package workbook.StepD;

import java.util.Scanner;

public class D5 {
	
	private int width, height;
	private int count[] = new int[5];
	private String s[] = {"[정사각형]","[좌우로 길쭉한 직사각형]","[위아래로 길쭉한 직사각형]","[일반적인 가로형 직사각형]","[일반적인 세로형 직사각형]"};
	
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
		
		if(width == height) count[0]++;
		else if(width >= height*2) count[1]++;
		else if(width*2 <= height) count[2]++;
		else if(width > height) count[3]++;
		else if(width < height) count[4]++;
	}
	
	public void printD5() {
		for(int i=0 ; i<5;i++) {
			System.out.println(s[i]+"의 개수는"+count[i]+"입니다.\n");
		}
		
	}

}
