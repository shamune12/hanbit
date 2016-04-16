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
public class Calculator {
	public String execute(int a , String op, int b) {
		String result ="";
		switch (op) {
		case "+":
			result=(a + "+" + b + " = " + (a + b));
		break;
		case "-":			
			result=(a + "-" + b + "=" + (a - b));
		break;
		case "*": 
			result=(a + "*" + b + "=" + (a * b));
		break;	
		case "/":
			result=(a + "/" + b + "=" + (a / b) + "..." + (a % b));
		break;			
		
		default:System.out.println("연산 기호를 잘못 넣었습니다.");
			break;
		}
		return result;
	}
}
