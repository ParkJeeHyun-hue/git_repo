
public class Exam6 {
	/** ���� �߻� : ������ ���� �����==>API Ŭ���� ��� : Math Ŭ������ ����Ѵ�.
	 * Math.random() �޼ҵ�� 0~1 ������ ���� double���� ���� �����.
	 * �̸� �̿��ϸ� Ư�� ������ ������ ���Ƿ� ���� �� �ִ�.
	 */
	public static void main(String[] args) {
		double r = Math.random();//�������� �ȶ߹Ƿ� import ���� ��밡��.=>�⺻ API Ŭ������.
		int startNum=10;
		int endNum=99;
		int result=0;
		
		result=(int)(r*(endNum-startNum+1)+startNum);
		System.out.println("r="+r);
		System.out.println("result="+result);
	}
}
