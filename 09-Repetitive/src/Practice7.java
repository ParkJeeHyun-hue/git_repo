//공배수 출력하기->3과 7의 공배수
public class Practice7 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<100000000;i++) {
			if(i%3==0 && i%7==0) {
				System.out.print(i+" ");
				count++;
				if (count%10==0) System.out.println();
			}
		}
		
	}

}
