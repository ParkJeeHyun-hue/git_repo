import java.util.Scanner;

public class Practice13_1 {
	public static void main(String[] args) {
		//����
		Scanner sc=new Scanner(System.in);
		int num=0; //��ȣ ����
		int money=0;//�ܰ� ����
		int inputMoney=0;//�Է� �ݾ� ����-->���� �ݾ��̶� ��ݱݾ��� 2���� �������� �ʰ�, �ϳ��� �Է°����θ� �޾ƹ�����.
		
		//���α׷��� ��� ������ �𸦰�쿡�� �ַ� while���� ����Ѵ�.
		while(true) {
			//�Է�
			System.out.println("1.���� 2.��� 3.�ܰ� 4.����");
			System.out.print("��ȣ ���� : ");
			num=sc.nextInt();
			
			//����
			switch(num) {
			case 1:// ����
				System.out.print("���ݾ� : ");
				inputMoney=sc.nextInt();
				money+=inputMoney;
				break;
			case 2://���
				System.out.print("��ݾ� : ");
				inputMoney=sc.nextInt();
				money-=inputMoney;
				break;
				
			case 3://�ܰ� ��ȸ
				System.out.println("�ܰ�� : "+money);
				break;

			case 4:// ����
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
			//���
			System.out.println();
		}
	}

}
