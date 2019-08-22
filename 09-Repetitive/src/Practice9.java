/**
 * 
 * while문을 사용하여 별탑 출력하기
 *
 */
public class Practice9 {
	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			int j=5-i;
			while(j>0) {
				System.out.print(" ");
				j--;
				}
			int z=1;
			while(z<=i) {
				System.out.print("*");
				z++;
			}
			System.out.println();
			i++;
		}
	}

}
