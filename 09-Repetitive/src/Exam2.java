

public class Exam2 {
	public static void main(String[] args) {
		int i,j=0;
		for( i=2; i<10 ; i++) { //2´Ü~9´Ü
			for(j=1; j<10; j++) {//1~9
				System.out.printf("%d*%d=%2d   ",i,j,i*j);
				if(j==9) {
					System.out.println();
					
				}
			}
			
			
		}
	}

}
