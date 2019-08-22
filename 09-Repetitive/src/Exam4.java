
//실제로 자주 사용하는 while문의 형태
public class Exam4{
	public static void main(String[] args) {
		int i=1;//for문의 초기값 역할
		int sum=0;
		while(true){//조건식 자리에 true를 사용하면, 조건식을 블럭안에 위치를 자유롭게
					// 배치할 수 있음.
			if(i>10) break;
			sum+=i;
			
			i++;//for문의 증감식 역할
			
		}
		System.out.println("sum="+sum);
	}
}
