import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int i=2;
		char a=0; //��� �������� �����ϴ� ���� ����
		while(true) {			
			System.out.print("�� ���� ������� �Է��Ͻÿ� : ");
			i=sc.nextInt();
			
			int j=1;
			while(j<=9) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				j++;
			}
					
			System.out.print("�����Ͻÿ�(y:���) : ");
			a=sc.next().charAt(0);
			if(a!='y') {
				System.out.println("�����մϴ�");
				break;
			}
			
			System.out.println();			
		}		
	}
}



