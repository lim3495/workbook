package workbook.StepD;

import java.util.Scanner;

public class D6 {
	
	private double m2_area, pyung_area;
	private int count1,count2,count3,count4;
	
	public D6() {
		input();
	}
	
	private void test_area() {
		
		if(pyung_area < 15) 
			count1++;
		else if (pyung_area >=15 && pyung_area <30) 
			count2++;
		else if (pyung_area >=30 && pyung_area <50) 
			count3++;
		else 
			count4++;
	}
	

	
	private void input() {
		
		Scanner s = new Scanner(System.in);
		for(int i=0 ; i<10 ; i++) {
		System.out.println("\n아파트의 분양 면적(제곱미터)을 입력하시오.");
		m2_area = s.nextDouble();
		
		pyung_area = m2_area / 3.305;
		
		System.out.println("-->이 아파트의 평형은"+pyung_area+"입니다.\n");
		
		test_area();
		}
				

	}
	
	public void printD6() {
		System.out.printf("[소형 아파트]의 개수는 %d 입니다.\n",count1);
		System.out.printf("[중소형 아파트]의 개수는 %d 입니다.\n",count2);
		System.out.printf("[중형 아파트]의 개수는 %d 입니다.\n",count3);
		System.out.printf("[대형 아파트]의 개수는 %d 입니다.\n",count4);
	}
	

	
	

}
