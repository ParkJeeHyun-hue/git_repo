/***
 * 
 * 이중 for문을 이용하여 4x+5y=60의 모든 해를 구해서 (x,y)형태로 출력해보세요
 *
 */
public class Practice12 {
	public static void main(String[] args) {
		for(int x=1;x<=60;x++) {
			for(int y=1; y<60;y++) {
				if((4*x+5*y)==60) {//연산결과는 중괄호로 묶는게 좋다!
									// 연산자 * + = 이용
					System.out.printf("(%2d,%2d)\n",x,y);
				}
			}
		}
	}
}
