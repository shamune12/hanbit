package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * maxmin.java/
 * seunghwan.gmail.com
 * story : 배열 + forloop
 * @author USER
 *
 */
public class maxmin {
	
		/**
		 [문제]
		 한 반에 5명의 학생이 시험을 치렀습니다.
		 선생님이 5명의 점수를 입력하자마자 바로 최고점과 최저점이 출력되는 프로그램을 완성하십시오.
		 */
	public static void main(String[] args) {
		System.out.println("***점수를 입력하면 최고점, 최저점이 출력됩니다***");
		System.out.println("총 3명의 점수만 입력이 가능합니다. 입력해 주십시오");
		
		Scanner scanner = new Scanner(System.in);
		int max =0, score1=0, score2=0, score3=0;
		
		System. out.println("첫 번째 학생");
        score1 = scanner.nextInt();
        System. out.println("두 번째 학생");
        score2 = scanner.nextInt();
        System. out.println("세 번째 학생");
        score3 = scanner.nextInt();
		
		if ((score1>score2)&&(score1>score3)) {
			max=score1;
		System.out.println(score1);
		}else if (score2>score3){
			max = score2;
		System.out.println(score2);
		}			
		else {
			max = score3;
		System.out.println(score3);
			
		}
		
		
		System.out.println(max);
		}

}

