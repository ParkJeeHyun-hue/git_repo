/**
 * 10~99 ������ 2�� �߻��Ͽ� ���� ���ߴ� ����
 * -�������� �� 5������ �����Ѵ�.
 * -1������ ���� 20����
 * -���� Ʋ���� ��ȸ�� 1�� �� �����Ѵ�.
 * 
 * ������ ������ ���ڰ� �߻��Ǵ� ���̴�.
 */
import java.util.Scanner;
public class Practice14 {
	public static void main(String[] args) {
		//����
		Scanner sc=new Scanner(System.in); //Ű���忡�� �޾ƿ���
		int startNum=10;// ���������� ���� ���۰�
		int endNum=99; //���� ������ ���� ����
		int result1=0,result2=0;// ������ 2�� 
		int inputAnswer=0;// ��� Ǯ������ �Է��ؾ��ϴ� ��
		int count=0; //������ ���߾����� ������ ����
		char a1=0; //��� ��� Ǯ���� ���� ����
		
		int i=0;
		int wrongcnt=0;
		while(true) { // ��� ������
			
					while(i<=4) { //������ �Ѽ�Ʈ�� 5�� Ǯ����. 0,1,2,3,4 <=�̷��� �ؼ� 5����
						if(wrongcnt == 0 || wrongcnt > 1) {
							double r1 = Math.random(); 
							double r2 = Math.random();
							
							result1=(int)(r1*(endNum-startNum+1)+startNum);
							result2=(int)(r2*(endNum-startNum+1)+startNum);
						}
						System.out.print("["+(i+1)+"] "+ result1+" + "+ result2+"="); //���� ���Ƿ� �޾ƿ���, ���� Ǯ��!
						inputAnswer=sc.nextInt();
						
						//������ ������ ������ ���, Ʋ������ Ʋ�ȴٰ� �˷��ְ� �ùٸ� ���� ���
						if(result1+result2==inputAnswer) {
							System.out.println("������");
							count++;// ����� ����
						}
						else {
							wrongcnt++;
							System.out.println("Ʋ�Ƚ��ϴ�. ");
							if(wrongcnt==2)	{
								System.out.println(" ���� : "+(result1+result2));
								wrongcnt=0;
							}
						}
						i++;
					}
			
			System.out.println("����� �� "+count+"������ ���߾ "+(count*20)+"�� �Դϴ�."); //while(true)�ȿ� ���ԵǾ�� 5������ Ǯ�� ���������� ��µȴ�.
			System.out.print("continue(y/n):");
			a1=sc.next().charAt(0);
			if(a1=='y') {
				count=0;//������� �ʱ�ȭ�� ����� �ٽ� ���� ������ ���� �ִ�.
				i=0;// �ʱ�ȭ�� ������ ������ ó�� while������ ���ư��� �ϴµ� i=6�̹Ƿ� ������ Ǯ �� ����.
				continue;
			}
			else if(a1=='n')  System.out.print("���α׷��� �����մϴ�."); break;
			}
	}
}
