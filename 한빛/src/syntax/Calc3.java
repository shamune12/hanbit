package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9. Calc.java/ seunghwan.gmail.com story : branch 예제 (계산기 예제)
 * 
 * @author USER
 *
 */
public class Calc3 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0;
		String op = ""; // 넓값 : null
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		a = scanner.nextInt();
		System.out.println("연산자 종류를 입력( +, -, *, / 입니다)");
		op = scanner.next();
		System.out.println("두번째 정수 입력");
		b = scanner.nextInt();
		if (op.equals("+")) {
			c = a + b;
			System.out.println(a + "+" + b + " = " + c);
		} else if (op.equals("-")) {
			c = a - b;
			System.out.println(a + "-" + b + "=" + c);
			System.out.println();
		} else if (op.equals("*")) {
			c = a * b;
			System.out.println(a + "*" + b + "=" + c);
		} else if (op.equals("/")) {
			c = a / b;
			d = a % b;
			System.out.println(a + "/" + b + "=" + c + "..." + d);
		} else {
			System.out.println("연산 기호를 잘못 넣었습니다.");
		}
	}
}
