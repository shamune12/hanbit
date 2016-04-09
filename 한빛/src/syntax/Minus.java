package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * Minus.java/
 * seunghwan.gmail.com
 * story : 정수 마이너
 * @author USER
 *
 */
public class Minus {
	public static void main(String[] args) {
		System.out.println("정수 마이너스");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 숫자");
		int a = scanner.nextInt();
		System.out.println("두 번째 숫자");
		int b = scanner.nextInt();
		int c = a - b;
		System.out.println(a + "-" + b + "=" + c);
		
		
	}
}
