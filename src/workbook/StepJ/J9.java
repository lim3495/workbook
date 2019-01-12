package workbook.StepJ;
import java.util.Scanner;

public class J9 {
	
	private int one,two;
	
	public J9() {
		
		input();
		
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력하시오.");
		this.one = s.nextInt();
		this.two = s.nextInt();
		
	}
	
	int power(int n, int a) {
		
		if(a == 0)
			return 1;
		else if(a == 1)
			return n;
		else if( a > 1 && a % 2 ==0 )
			return ( power(n,a/2) * power(n,a/2) );
		else if ( a > 1 && a % 2 != 0)
			return ( power(n,a/2) * power(n,a/2) * n);
		else 
			return -1;
		
		
	}
	
	public void printJ9() {
		
		System.out.println(one+"의 "+two+"승은 "+power(one,two)+" 입니다.");
		
		
	}

}
