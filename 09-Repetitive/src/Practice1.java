import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		//����
		Scanner sc=new Scanner(System.in);
		
		int a=0;
		
		//�Է�
		System.out.print("1~100 ������ ����� ���� ���� �Է� : ");
		a=sc.nextInt();
		System.out.println();
		//����
		for(int i=1;i<=100;i++) {
			if(i%a==0) {
				System.out.print(+i+" ");
				
			}
		}
		//���
		System.out.println();
		System.out.printf("1~100 ������ %d�� ��� ���� = %d",a,100/a);
	}

}
