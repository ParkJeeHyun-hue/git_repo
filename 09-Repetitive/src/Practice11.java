import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//
		int i=0;
		String a,b,c,d=null;
		a="�Է�";
		b="�˻�";
		c="����";
		d="����";
			do {
				System.out.println();
				System.out.println("**************************");
				System.out.println("1."+a);
				System.out.println("2."+b);
				System.out.println("3."+c);
				System.out.println("4."+d);
				System.out.println("**************************");
				
				System.out.print("��ȣ ���� : " );
				i=sc.nextInt();
				
				if(i==1) {
					System.out.println(a+"�� �����Ͽ����ϴ�.");
				}
				else if(i==2) {
					System.out.println(b+"�� �����Ͽ����ϴ�.");
				}
				else if(i==3) {
					System.out.println(c+"�� �����Ͽ����ϴ�.");
				}
				else if(i==4) {
					System.out.println("���α׷��� "+d+"�մϴ�.");
				}
			}while(i==1 ||i==2 ||i==3); 
	

	}
}
//switch ���� ����Ͽ�����, System.exit(0);�� ����ϸ� ���α׷� ���Ḧ �� �� �ִ�.
