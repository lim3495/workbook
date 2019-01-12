package workbook.StepK;

import java.util.Scanner;

class point{

	Scanner s = new Scanner(System.in);
	private double x,y;
	private int point_xy[] = {0,0,0,0}; 
	private int area[] = new int[100];

	
	public point() {
		
	}
	void input(int n) {
		System.out.println(n+1+"번째 좌표의 X, Y 값을 입력하시오 -->");
		
		x = s.nextDouble();
		y = s.nextDouble();
		
		area[n] =get_xy();
		point_xy[get_xy()-1]++;
	}
	
	void output(int n) {
		
		System.out.println(n+1 +"번째 좌표는"+area[n]+"사분면에 위치합니다.");
		
	}
	
	void print() {
		for(int i=0 ; i<4 ; i++) {
			System.out.println(i+1 +"사분면의 좌표는 모두"+this.point_xy[i]+"개 입니다.");
		}
	}
	
	int get_xy() {
		
		if(x>0 && y>0) {
			return 1;
		}
		else if(x<0 && y>0) {
			return 2;
		}
		else if(x<0 && y<0)
		{
			return 3;
		}
		else if(x>0 && y<0)
		{
			return 4;
		}
		else 
			return -1;
		
		
	}
	
}

public class K3 {
	
	public void main() {
		
		point p = new point();
		
		p.input(0);
		System.out.println("=========================");
		p.output(0);
		p.print();
	}

}
