
public class Practice2 {
	public static void main(String[] args) {
		//선언
		int sum=0;
		//입력=>특별히 입력 할 것이 없다.
		//연산+출력 한꺼번에 이루어짐
		for(int i=1;i<100;i++) {
			sum+=i;
			if(i%10==0) {	
				System.out.printf("%2d ~ %3d = %3d\n",i-9,i,sum);
				sum=0;
			}
		}
	}
}
			
			
			
			
			
			
