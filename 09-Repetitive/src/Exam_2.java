
//행과 열을 바꾸고 싶으면 for문의 위치만 바꾸어 주면 된다.
public class Exam_2 {
	public static void main(String[] args) {
		int i,j=0;
		for( i=1; i<10 ; i++) { //2단~9단
			for(j=2; j<10; j++) {//1~9
				System.out.printf("%d*%d=%2d   ",j,i,i*j);
				if(j==9) {
					System.out.println();
					
				}
			}
			
			
		}
	}

}
