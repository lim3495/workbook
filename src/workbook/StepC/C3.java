package workbook.StepC;

import java.util.Scanner;

public class C3 {
	
	private int width, height;
	
	public C3() { input(); }
	
	public void printC3() {
		if(width == height)
			System.out.println("정사각형입니다.\n");
		else if(width >= height*2)
			System.out.println("좌우로 길쭉한 직사각형입니다.\n");
		else if(height >= width*2)
			System.out.println("위아래로 길쭉한 직사각형입니다.\n");
		else if(width > height)
			System.out.println("일반적인 가로형 직사각형입니다.\n");
		else if(width < height)
			System.out.println("일반적인 세로형 직사각형입니다.\n");
	}

	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("직사각형의 가로 크기를 입력하시오.\n");
		this.width = s.nextInt();
		System.out.println("직사각형의 세로 크기를 입력하시오.\n");
		this.height = s.nextInt();	
	}
	
	
}
