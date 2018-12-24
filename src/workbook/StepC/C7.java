package workbook.StepC;

import java.util.Scanner;

public class C7 {
	
	private int megabytes;
	private long bytes;
	private byte kind;
	private double time;
	
	public C7() {
		input();
	}
	public void printC7() {
		
		System.out.printf("파일 전송 시간은 %.1f초 입니다.\n",type_cal());
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("파일 용량을 메가바이트 단위로 입력하세요.\n");
		megabytes = s.nextInt();
		System.out.println("전송 방식을 1:Wi-Fi, 2:BlueToorh, 3:LTE, 4:USB 에서 선택하여 입력하세요.\n");
		kind = s.nextByte();
		
	}
	
	double type_cal() {
		bytes = megabytes * 1024 * 1024;
		
		if(kind == 1)
			time = (double)(bytes/1500000);
		else if(kind == 2)
			time = (double)(bytes/300000);
		else if(kind == 3)
			time = (double)(bytes/1000000);
		else if(kind == 4)
			time = (double)(bytes/60000000);
		
		return this.time;
	}

}
