/**
 * 키보드로 입력된 데이터로 예금, 출금,잔고, 종료 기능을 제공하는 간단 계좌관리 프로그램을 작성하사ㅣ오.
 * 1. 예금  2.출금 3. 잔고 4.종료
 */
import java.util.Scanner;

public class Practice13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int money = 0;
		int inputMoney=0;
		int num1=0;
		String a,b,c,d=null;
		
		a="예금";
		b="출금";
		c="잔고";
		d="종료";
		
		do {
			System.out.println("1."+a+" 2."+b+" 3."+c+" 4."+d);
			System.out.print("번호 선택 : ");
			num1=sc.nextInt();
			
			if(num1==1) {
				System.out.print("예금액 : ");
				inputMoney=sc.nextInt();
				System.out.println();
				money+=inputMoney;
			}
			else if(num1==2) {				
				System.out.print("출금액 : ");
				inputMoney=sc.nextInt();
				System.out.println();
				money-=inputMoney;
				
			}
			else if(num1==3) {
				
				System.out.print("잔고액 : "+ money);
				System.out.println();
				System.out.println();
				
			}
			else if(num1==4) {
				System.out.println("프로그램을 종료합니다.");
				
			}	
		}while(num1==1||num1==2||num1==3); System.out.println("잘못 입력하였습니다");
	}

}
