/**
 *         *
 *        **
 *       ***
 *      ****
 *     *****
 *      ****
 *       ***
 *        **
 *         *  ==>�� ������� ��ž ���   
 */ 	   
public class Practice5 {
	public static void main(String[] args) {
		for(int x=1; x<=5;x++) {
		
			for(int y=5-x; y>0;y--)//���鹮�� ����ϱ�-->4���� ��µǾ��� {
				{
				System.out.print(" ");
				}
			for(int z=1; z<=x;z++) {
				System.out.print("*");
			}
			System.out.println();
			}
		
		for(int k=1;k<=4;k++) {
			for(int a=1;a<=k;a++) {//���鹮���� ������ ������ ���� ������ ����.
				System.out.print(" ");
			}
			for(int b=5-k; b>0;b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


