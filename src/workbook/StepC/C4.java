package workbook.StepC;

import java.util.Scanner;

public class C4 {
	
	private double m2_area;
	private double pyung_area;
	
	public C4() {input();}
	public void printC4() {
		System.out.printf("아파트의 평형은 %.1f 입니다.\n",output());
		
		if(output()<15)
			System.out.println("소형 아파트 입니다.\n");
		else if(output()>=15 && output()<30)
			System.out.println("중소형 아파트 입니다.\n");
		else if(output()>=30 && output()<50)
			System.out.println("중형 아파트 입니다.\n");
		else 
			System.out.println("대형 아파트 입니다.\n");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("아파트의 면적(제곱미터)을 입력하시오.\n");
		m2_area = s.nextDouble();
		
	}
	
	double output() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}
}
