package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * manmin3ex.java/
 * seunghwan.gmail.com
 * story : 
 * @author USER
 *
 */
public class maxmin3ex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("**점수 입력하면 최고점(만점은 100,빵점은 0)");
		System.out.println("**총 5명만 입력이 가능합니다. 입력해주세요**");
		
		int max = 0, min = 100;
		//score1 = 0, score2 = 0, score3= 0;
		
		int[] scores = new int [5];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scanner.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+"\t");
		}
		for (int i = 0; i < scores.length; i++) {
			if (scores[i]<=100) {
				max = scores[i];
			}
			if (scores[i]<=100) {
				min = scores[i];
			}
		}
		
		
		System.out.println("최고점은 "+max+",최저점 : "+min+"이다.");

	}
}
