package workbook.StepI;
import java.util.Scanner;

public class I2 {
	
	private char text;
	private int blank,size;
	
	public I2() {
		
		getdata();
		PrintCharWithBlank(blank,size,text);
	}
	
	void getdata() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("직각 삼각형을 그리는데 사용할 문자를 입력하시오.");
		text = s.next().charAt(0);
		
		System.out.println("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오.");
		size = s.nextInt();
		blank = s.nextInt();
		
	}
	
	void PrintCharWithBlank(int blank,int size, char text) {
		int i=1;
		
		while(i<=size) {
			
			for(int j = blank + size -i ; j > 0 ; j--) {
				System.out.print(" ");
			}
	
			for(int k = 0; k < i ; k++) {
				System.out.print(text);
			}
			System.out.print("\n");
			
			i++;
			
			
		}
		
		
	}
	
	

}
