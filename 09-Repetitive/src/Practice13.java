/**
 * Ű����� �Էµ� �����ͷ� ����, ���,�ܰ�, ���� ����� �����ϴ� ���� ���°��� ���α׷��� �ۼ��ϻ�ӿ�.
 * 1. ����  2.��� 3. �ܰ� 4.����
 */
import java.util.Scanner;

public class Practice13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int money = 0;
		int inputMoney=0;
		int num1=0;
		String a,b,c,d=null;
		
		a="����";
		b="���";
		c="�ܰ�";
		d="����";
		
		do {
			System.out.println("1."+a+" 2."+b+" 3."+c+" 4."+d);
			System.out.print("��ȣ ���� : ");
			num1=sc.nextInt();
			
			if(num1==1) {
				System.out.print("���ݾ� : ");
				inputMoney=sc.nextInt();
				System.out.println();
				money+=inputMoney;
			}
			else if(num1==2) {				
				System.out.print("��ݾ� : ");
				inputMoney=sc.nextInt();
				System.out.println();
				money-=inputMoney;
				
			}
			else if(num1==3) {
				
				System.out.print("�ܰ�� : "+ money);
				System.out.println();
				System.out.println();
				
			}
			else if(num1==4) {
				System.out.println("���α׷��� �����մϴ�.");
				
			}	
		}while(num1==1||num1==2||num1==3); System.out.println("�߸� �Է��Ͽ����ϴ�");
	}

}
