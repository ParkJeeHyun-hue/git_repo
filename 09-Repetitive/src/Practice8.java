/**
 * 
 * while문을 사용하여 별출력하기
 *
 */
public class Practice8 {
	public static void main(String[] args) {
		int x=1; //for문의 초기값 역할
		while(x<=5) {//5층 설정//
			int y=1;
			//for의 초기값 역할
			while(y<=x) {
				System.out.print("*");
				y++;//for의 증감식 역할
				}
			System.out.println();
			x++;//for문의 증감식 역할                                                                                                                                                                                                                                                                              
		}
	}
}


