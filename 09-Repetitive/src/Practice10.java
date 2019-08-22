
public class Practice10 {
	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			int j=5-i;
			while(j>0) {
				System.out.print(" ");
				j--;
			}
			
			int a=1;
			while(a<=(2*i)-1) {
				System.out.print("*");
				a++;
			}
			System.out.println();
			i++;
		}
	}
}
