package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * divide.java/
 * seunghwan.gmail.com
 * story : divide
 * @author USER
 *
 */
public class Divide {
	public static void main(String[] args) {
		int a=0, b=0, c=0, d=0;
		System.out.println("나누기");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 수");
		a = scanner.nextInt();
		System.out.println("두번째 수");
		b = scanner.nextInt();
		c = a / b;
		d = a % b;
		System.out.println(a + "/" + b + "=" + c +"..." + d);
	}
}
