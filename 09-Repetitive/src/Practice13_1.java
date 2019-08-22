import java.util.Scanner;

public class Practice13_1 {
	public static void main(String[] args) {
		//선언
		Scanner sc=new Scanner(System.in);
		int num=0; //번호 저장
		int money=0;//잔고 저장
		int inputMoney=0;//입력 금액 저장-->예금 금액이랑 출금금액을 2개로 저장하지 않고, 하나의 입력값으로만 받아버린다.
		
		//프로그램을 몇번 돌릴지 모를경우에는 주로 while문을 사용한다.
		while(true) {
			//입력
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.print("번호 선택 : ");
			num=sc.nextInt();
			
			//연산
			switch(num) {
			case 1:// 예금
				System.out.print("예금액 : ");
				inputMoney=sc.nextInt();
				money+=inputMoney;
				break;
			case 2://출금
				System.out.print("출금액 : ");
				inputMoney=sc.nextInt();
				money-=inputMoney;
				break;
				
			case 3://잔고 조회
				System.out.println("잔고액 : "+money);
				break;

			case 4:// 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			//출력
			System.out.println();
		}
	}

}
