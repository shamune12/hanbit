package syntax;

import java.util.Scanner;

public class maxmin3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("**점수 입력하면 최고점");
		System.out.println("**총 세명만**");
		
		int max = 0;
		//score1 = 0, score2 = 0, score3= 0;
		
		int[] scores = new int [3];
		scores[0] = scanner.nextInt();
		scores[1] = scanner.nextInt();
		scores[2] = scanner.nextInt();
		
		if ((scores[0]>scores[1])&&(scores[0]>scores[2])) {
			max = scores[0];
		}else if (scores[1]>scores[2]) {
			max = scores[1];
		}else {
		max = scores[2];	
		}
		System.out.println("최고점은 "+max+"다.");
	}
}
