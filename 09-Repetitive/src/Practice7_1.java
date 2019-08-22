import java.util.Scanner;

//두수를 입력받아서 그 수의 공배수 출력하기->1부터 100사이
public class Practice7_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b=0;
		System.out.print("두 수를 입력 하시오 : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		for(int i=1;i<=100;i++) {
			if(i%a==0 && i%b==0) {
				System.out.print(i+" ");
			}
		}
				
	}

}
