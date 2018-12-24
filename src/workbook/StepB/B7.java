package workbook.StepB;
import java.util.Scanner;

public class B7 {
	
	private int megabytes;
	private long bytes;
	private String usb2;
	private int time;

	public B7() {input();}

	public void printB7() {
		System.out.println("파일 전송시간은"+time()+"초 입니다.\n");
	}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("파일을 메가바이트 단위로 입력하세요.\n");
		this.megabytes=s.nextInt();
		System.out.println("USB 포트가 2.0 이상이면 Y, 아니면 N를 입력하세요.\n");
		this.usb2 = s.next();	
	}
	int time() {
		bytes = (long)megabytes * 1024 *1024;

		if(usb2.equalsIgnoreCase("Y"))
			time = (int)(bytes / 60000000);
		else
			time = (int)bytes / 1500000;

		return this.time;
	}

}
