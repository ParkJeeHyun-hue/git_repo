/***
 * 
 * ���� for���� �̿��Ͽ� 4x+5y=60�� ��� �ظ� ���ؼ� (x,y)���·� ����غ�����
 *
 */
public class Practice12 {
	public static void main(String[] args) {
		for(int x=1;x<=60;x++) {
			for(int y=1; y<60;y++) {
				if((4*x+5*y)==60) {//�������� �߰�ȣ�� ���°� ����!
									// ������ * + = �̿�
					System.out.printf("(%2d,%2d)\n",x,y);
				}
			}
		}
	}
}
