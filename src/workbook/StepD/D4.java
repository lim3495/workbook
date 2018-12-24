package workbook.StepD;

import java.util.Scanner;

public class D4 {
	
	private int count_all, count_young, birth_year, age;
	
	public D4() {input();}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("가족이 몇 명인지 입력하세요.\n");
		count_all = s.nextInt();
		for(int i = 0 ; i< count_all ; i++) {
			System.out.println("태어난 년도를 입력하세요.\n");
			birth_year = s.nextInt();
			test_young();
		}//for 
	}
	
	void test_young() {
		
		age = 2014 - birth_year +1;
		
		if(age < 20)
			count_young++;
		
	}
	
	public void printD4() {
		System.out.printf("가족들 중에 미성년자는 모두 %d명 입니다.\n",count_young);
	}

}
