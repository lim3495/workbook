package workbook.StepB;
import java.util.Scanner;

public class B8 {
	private int num1 , num2 , num3;

	public B8() {input();}

	public void printB8() {
		if(num1==num2||num2==num3||num1==num3)
			System.out.printf("1번 조건 만족 : 3개의 숫자 중 적어도 두 수의 값이 같다.\n");
		if((num1>50 && num2>50)||(num2>50 && num3>50)||(num1>50 && num3>50))
			System.out.printf("2번 조건 만족 : 3개의 숫자 중 적어도 두 수의 크기가 모드 50보다 크다.\n");
		if((num1+num2)==num3 ||(num2+num3)==num1 ||(num1+num3)==num2 )
			System.out.printf("3번 조건 만족 : 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같다.\n");
		if((num1%num2==0 && num1%num3==0) || (num2%num1==0 && num2%num3==0) ||(num3%num1==0 && num3%num2==0))
			System.out.printf("4번 조건 만족 : 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어떨어지는 경우가 있다.\n");
	}

	void input() {
		Scanner s = new Scanner(System.in);

		System.out.printf("첫번째 숫자를 입력하세요.");
		this.num1 = s.nextInt();
		System.out.printf("\n두번째 숫자를 입력하세요.");
		this.num2 = s.nextInt();
		System.out.printf("\n세번째숫자를 입력하세요.");
		this.num3 = s.nextInt();
	}
}
