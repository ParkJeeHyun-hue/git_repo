
public class Exam6 {
	/** 난수 발생 : 임의의 숫자 만들기==>API 클래스 사용 : Math 클래스를 사용한다.
	 * Math.random() 메소드는 0~1 범위를 갖는 double형의 값을 만든다.
	 * 이를 이용하면 특정 범위의 정수를 임의로 만들 수 있다.
	 */
	public static void main(String[] args) {
		double r = Math.random();//빨간줄이 안뜨므로 import 없이 사용가능.=>기본 API 클래스임.
		int startNum=10;
		int endNum=99;
		int result=0;
		
		result=(int)(r*(endNum-startNum+1)+startNum);
		System.out.println("r="+r);
		System.out.println("result="+result);
	}
}
