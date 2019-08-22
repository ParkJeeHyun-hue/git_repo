import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int i=2;
		char a=0; //계속 진행할지 결정하는 문자 저장
		while(true) {			
			System.out.print("몇 단을 출력할지 입력하시오 : ");
			i=sc.nextInt();
			
			int j=1;
			while(j<=9) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				j++;
			}
					
			System.out.print("선택하시오(y:계속) : ");
			a=sc.next().charAt(0);
			if(a!='y') {
				System.out.println("종료합니다");
				break;
			}
			
			System.out.println();			
		}		
	}
}



