
//������ ���� ����ϴ� while���� ����
public class Exam4{
	public static void main(String[] args) {
		int i=1;//for���� �ʱⰪ ����
		int sum=0;
		while(true){//���ǽ� �ڸ��� true�� ����ϸ�, ���ǽ��� ���ȿ� ��ġ�� �����Ӱ�
					// ��ġ�� �� ����.
			if(i>10) break;
			sum+=i;
			
			i++;//for���� ������ ����
			
		}
		System.out.println("sum="+sum);
	}
}
