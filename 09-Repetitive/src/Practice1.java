import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		//선언
		Scanner sc=new Scanner(System.in);
		
		int a=0;
		
		//입력
		System.out.print("1~100 사이의 배수를 구할 숫자 입력 : ");
		a=sc.nextInt();
		System.out.println();
		//연산
		for(int i=1;i<=100;i++) {
			if(i%a==0) {
				System.out.print(+i+" ");
				
			}
		}
		//출력
		System.out.println();
		System.out.printf("1~100 사이의 %d의 배수 개수 = %d",a,100/a);
	}

}
