package workbook.StepK;
import java.util.Scanner;

class Student{
	
	private int kor[] = new int[100];
	private int eng[] = new int[100];
	private int mat[] = new int[100];
	private int	total[] = new int[100];
	private double ave[] = new double[100];
	int num=0;
	
	public Student() {
		
	}
	
	void input() {
		
	Scanner s = new Scanner(System.in);
	
		System.out.println("등록할 학생의 명수는?");
		this.num = s.nextInt();
	
	for(int i=0 ; i<num ; i++) {
		
		System.out.println(i+1 +"번 학생의 국어, 영어, 수학점수를 입력하시오.");
		kor[i] = s.nextInt();
		eng[i] = s.nextInt();
		mat[i] = s.nextInt();
		
		get_ave(i);
		
	}
	
	}
	
	void get_ave(int index) {
		
		this.total[index] = this.kor[index] + this.eng[index] + this.mat[index];
		this.ave[index] = total[index] / 3.0 ;
		
	}
	
	void print(int index) {
		
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t",index+1 , kor[index] , eng[index] , mat[index] , total[index] , ave[index]);
		
		if(ave[index] >= 95)
			System.out.println("A+");
		else if(ave[index] < 95 && ave[index] >= 90)
			System.out.println("A");
		else if(ave[index] < 90 && ave[index] >= 85)
			System.out.println("B+");
		else if(ave[index] < 85 && ave[index] >= 80)
			System.out.println("B");
		else if(ave[index] < 80 && ave[index] >= 75)
			System.out.println("C+");
		else if(ave[index] < 75 && ave[index] >= 70)
			System.out.println("D+");
		else if(ave[index] < 70 && ave[index] >= 65)
			System.out.println("D");
		else 
			System.out.println("F");
	}
	
}

public class K7 {
	
	public void main() {
		
			Student s = new Student();
			s.input();
		
		System.out.println("====================");
		System.out.println("등록된"+s.num+"명의 학생 목록은 다음과 같습니다.");
		System.out.println("------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		for(int i=0 ; i<s.num ; i++)
			s.print(i);
		
	}
	


}
