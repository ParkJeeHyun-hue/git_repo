//1,3,5,7,9���� ������� �Ƕ�̵� ���·� ����ϱ�
//�Ƕ�̵� 2��-> ���̾Ƹ��, �𷡽ð� ������� ����� ������.
public class Practice6 {
	public static void main(String[] args) {
		for(int x=5;x>0;x--) {//������ ��Ÿ��
			for(int y=5-x; y>0; y--) {
				System.out.print(" ");
			}
			for(int z=1;z<=(2*x-1);z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int x=1;x<=4;x++) {//������ ��Ÿ��
			for(int y=4-x; y>0; y--) {
				System.out.print(" ");
			}
			for(int z=1;z<=(2*x+1);z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	}

