package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9. 
 * Calc.java/ 
 * seunghwan.gmail.com 
 * story : branch 예제 (계산기 프로그램 : switch case
 * 
 * @author USER
 *
 */
public class Calc4 {
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

		switch (op) {
		case "+":
		System.out.println(a + "+" + b + " = " + (a + b));
		break;
		case "-":			
		System.out.println(a + "-" + b + "=" + (a - b));
		break;
		case "*": 
		System.out.println(a + "*" + b + "=" + (a * b));
		break;	
		case "/":
		System.out.println(a + "/" + b + "=" + (a / b) + "..." + (a % b));
		break;			
		
						

		default:System.out.println("연산 기호를 잘못 넣었습니다.");
			break;
		}
	}
}
