//1,3,5,7,9개의 별모양을 피라미드 형태로 출력하기
//피라미드 2개-> 다이아몬드, 모래시계 모양으로 출력이 가능함.
public class Practice6 {
	public static void main(String[] args) {
		for(int x=5;x>0;x--) {//층수를 나타냄
			for(int y=5-x; y>0; y--) {
				System.out.print(" ");
			}
			for(int z=1;z<=(2*x-1);z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int x=1;x<=4;x++) {//층수를 나타냄
			for(int y=4-x; y>0; y--) {
				System.out.print(" ");
			}
			for(int z=1;z<=(2*x+1);z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	}

