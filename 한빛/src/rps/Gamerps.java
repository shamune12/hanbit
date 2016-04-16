package rps;

import java.util.Scanner;

import javax.xml.crypto.dsig.CanonicalizationMethod;

/**
 * 2016. 4. 16.
 * rps.java/
 * seunghwan.gmail.com
 * story : 가위바위보 게임
 * @author USER
 *
 */
public class Gamerps {
	/**
	컴퓨터와 사용자간의 가위바위보 게임을 완성하시오.
	Math.random()*E+S
	S는 시작 값 E는 마지막 값 
	 */
	public static void main(String[] args) {
	int sccisors=1, rock=2, paper=3, rpsvalue=0, comvalue=0;
		System.out.println("***가위바위보 게임***");
		System.out.println("가위:1, 바위:2, 보:3");
		Scanner scanner = new Scanner(System.in);
		rpsvalue = scanner.nextInt();
		comvalue = (int) (Math.random()*3+1);
		switch (rpsvalue) {
		case 1:
			if (comvalue==1) {
				System.out.println("비겼습니다.");
			}
				else if (comvalue==2) {
				System.out.println("이겼습니다.");
			}	
				else {
					System.out.println("졌습니다.");
			}
			break;
		case 2:
			if (comvalue==1) {
			System.out.println("이겼습니다.");
		}
			else if (comvalue==2) {
			System.out.println("비겼습니다.");
		}	
			else {
				System.out.println("졌습니다.");
		}
			break;
		case 3:
			if (comvalue==1) {
				System.out.println("졌습니다.");
			}
				else if (comvalue==2) {
				System.out.println("이겼습니다.");
			}	
				else {
					System.out.println("비겼습니다.");
			}
			break;

		default: System.out.println( "1~3까지 숫자만 입력바랍니다.");
			break;
		}
	System.out.println("컴퓨터가 이겠습니다.");
	}
}
