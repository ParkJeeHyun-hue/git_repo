/**
 * 10~99 난수를 2개 발생하여 합을 맞추는 게임
 * -문제수는 총 5문제를 제공한다.
 * -1문제당 점수 20점씩
 * -만약 틀리면 기회를 1번 더 제공한다.
 * 
 * 난수란 임의의 숫자가 발생되는 것이다.
 */
import java.util.Scanner;
public class Practice14 {
	public static void main(String[] args) {
		//선언
		Scanner sc=new Scanner(System.in); //키보드에서 받아오기
		int startNum=10;// 난수설정을 위한 시작값
		int endNum=99; //난수 설정을 위한 끝값
		int result1=0,result2=0;// 난수값 2개 
		int inputAnswer=0;// 퀴즈를 풀기위해 입력해야하는 값
		int count=0; //문제를 맞추었을때 문제수 세기
		char a1=0; //퀴즈를 계속 풀지에 대한 여부
		
		int i=0;
		int wrongcnt=0;
		while(true) { // 계속 돌리기
			
					while(i<=4) { //문제는 한세트에 5개 풀것임. 0,1,2,3,4 <=이렇게 해서 5문제
						if(wrongcnt == 0 || wrongcnt > 1) {
							double r1 = Math.random(); 
							double r2 = Math.random();
							
							result1=(int)(r1*(endNum-startNum+1)+startNum);
							result2=(int)(r2*(endNum-startNum+1)+startNum);
						}
						System.out.print("["+(i+1)+"] "+ result1+" + "+ result2+"="); //난수 임의로 받아오고, 퀴즈 풀기!
						inputAnswer=sc.nextInt();
						
						//정답이 맞으면 딩동댕 출력, 틀렸으면 틀렸다고 알려주고 올바른 정답 출력
						if(result1+result2==inputAnswer) {
							System.out.println("딩동댕");
							count++;// 정답수 저장
						}
						else {
							wrongcnt++;
							System.out.println("틀렸습니다. ");
							if(wrongcnt==2)	{
								System.out.println(" 정답 : "+(result1+result2));
								wrongcnt=0;
							}
						}
						i++;
					}
			
			System.out.println("당신은 총 "+count+"문제를 맞추어서 "+(count*20)+"점 입니다."); //while(true)안에 포함되어야 5문제를 풀고 끝날때마다 출력된다.
			System.out.print("continue(y/n):");
			a1=sc.next().charAt(0);
			if(a1=='y') {
				count=0;//정답수도 초기화를 해줘야 다시 맞은 문제를 셀수 있다.
				i=0;// 초기화를 해주지 않으면 처음 while문으로 돌아가긴 하는데 i=6이므로 문제를 풀 수 없다.
				continue;
			}
			else if(a1=='n')  System.out.print("프로그램을 종료합니다."); break;
			}
	}
}
