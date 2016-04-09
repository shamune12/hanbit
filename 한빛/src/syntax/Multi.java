package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * Multi.java/
 * seunghwan.gmail.com
 * story :  곱셈 문법
 * @author USER
 *
 */
public class Multi {
	public static void main(String[] args) {
		int a=0, b=0, c=0;  // 지역변수 초기화
		System.out.println();  
		System.out.println("==곱셈 문법==");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 수 입력");
		a = scanner.nextInt();
		System.out.println("두 번째 수 입력");
		b = scanner.nextInt();
		c= a * b;
		System.out.println(a+"*"+b+"="+c);
	}
}
