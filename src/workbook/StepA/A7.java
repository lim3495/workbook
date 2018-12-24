package workbook.StepA;

import java.util.Scanner;

public class A7 {
	
	private int giga;
	private int mega;
	private int kilo;
	private long bytes;
	

	public A7() {input();}
	public void printA7() {
		System.out.println(output_mega()+"메가바이트,\n");
		System.out.println(output_kilo()+"킬로바이트,\n");
		System.out.println(output_byte()+"바이트 입니다.\n");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("파일 용량을 기가바이트 단위로 입력하세요.\n");
		this.giga = s.nextInt();

	}
	
	int output_mega() {
		this.mega = this.giga *1024;
		return this.mega;
	}
	int output_kilo() {
		this.kilo = this.mega *1024;
		return this.kilo;
	}
	
	long output_byte() {
		this.bytes = (long)kilo *1024;
		return this.bytes;
	}

}
