import java.util.Scanner;

//�μ��� �Է¹޾Ƽ� �� ���� ����� ����ϱ�->1���� 100����
public class Practice7_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b=0;
		System.out.print("�� ���� �Է� �Ͻÿ� : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		for(int i=1;i<=100;i++) {
			if(i%a==0 && i%b==0) {
				System.out.print(i+" ");
			}
		}
				
	}

}
