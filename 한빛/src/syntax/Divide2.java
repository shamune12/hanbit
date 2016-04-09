package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * Divide2.java/
 * seunghwan.gmail.com
 * story : 
 * @author USER
 *
 */
public class Divide2 {
	public static void main(String[] args) {
		int a =0, b=0, c=0, d=0;
		System.out.println("나누기 다시 한번");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 수");
		a = scanner.nextInt();
		System.out.println("두 번째 수");
		b = scanner.nextInt();
		c = a / b;
		d = a % b;
		System.out.println(a + "/" + b + "=" + c + "..." + d);
		
		
	}
}
