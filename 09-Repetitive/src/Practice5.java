/**
 *         *
 *        **
 *       ***
 *      ****
 *     *****
 *      ****
 *       ***
 *        **
 *         *  ==>이 모양으로 별탑 출력   
 */ 	   
public class Practice5 {
	public static void main(String[] args) {
		for(int x=1; x<=5;x++) {
		
			for(int y=5-x; y>0;y--)//공백문자 출력하기-->4개가 출력되야함 {
				{
				System.out.print(" ");
				}
			for(int z=1; z<=x;z++) {
				System.out.print("*");
			}
			System.out.println();
			}
		
		for(int k=1;k<=4;k++) {
			for(int a=1;a<=k;a++) {//공백문자의 개수와 나머지 줄의 개수가 같다.
				System.out.print(" ");
			}
			for(int b=5-k; b>0;b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


