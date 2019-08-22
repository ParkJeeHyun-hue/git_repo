import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//
		int i=0;
		String a,b,c,d=null;
		a="입력";
		b="검색";
		c="삭제";
		d="종료";
			do {
				System.out.println();
				System.out.println("**************************");
				System.out.println("1."+a);
				System.out.println("2."+b);
				System.out.println("3."+c);
				System.out.println("4."+d);
				System.out.println("**************************");
				
				System.out.print("번호 선택 : " );
				i=sc.nextInt();
				
				if(i==1) {
					System.out.println(a+"을 선택하였습니다.");
				}
				else if(i==2) {
					System.out.println(b+"을 선택하였습니다.");
				}
				else if(i==3) {
					System.out.println(c+"를 선택하였습니다.");
				}
				else if(i==4) {
					System.out.println("프로그램을 "+d+"합니다.");
				}
			}while(i==1 ||i==2 ||i==3); 
	

	}
}
//switch 문을 사용하였을시, System.exit(0);을 사용하면 프로그램 종료를 할 수 있다.
