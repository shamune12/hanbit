package syntax;

/**
 * 2016. 4. 16.
 * continues.java/
 * seunghwan.gmail.com
 * story : 명령문 (return, break, continue) 연습
 * @author USER
 *
 */
public class continues {
	/*
	 [문제]
	 1부터 10까지의 정수중에서 3의 배수를 제외한 수를 출력하시오.
	 */
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			if (i%3==0) {

				continue;
				// 조건이 맞으면 아래로 진행하지 말고 다시 처음에서 시작해라.
			}
			System.out.print(i+"\t");
		}
	}
}
