
//��� ���� �ٲٰ� ������ for���� ��ġ�� �ٲپ� �ָ� �ȴ�.
public class Exam_2 {
	public static void main(String[] args) {
		int i,j=0;
		for( i=1; i<10 ; i++) { //2��~9��
			for(j=2; j<10; j++) {//1~9
				System.out.printf("%d*%d=%2d   ",j,i,i*j);
				if(j==9) {
					System.out.println();
					
				}
			}
			
			
		}
	}

}
