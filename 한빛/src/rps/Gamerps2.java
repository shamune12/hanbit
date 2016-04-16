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
public class Gamerps2 {
	/**
	컴퓨터와 사용자간의 가위바위보 게임을 완성하시오.
	Math.random()*E+S
	S는 시작 값 E는 마지막 값 
	 */
	public static void main(String[] args) {

		System.out.println("***가위바위보 게임***");
		System.out.println("가위:1, 바위:2, 보:3");
		Scanner scanner = new Scanner(System.in);
		//---------------------------------가공 할 데이터---------------------------------------------------
		int sccisors=1, rock=2, paper=3, rpsvalue=0, comvalue=0;
		String result = "";
		rpsvalue = scanner.nextInt();
		comvalue = (int) (Math.random()*3+1);
		switch (rpsvalue) {
		case 1:
			if (comvalue==1) {
				result = "사용자는 가위, 컴퓨터는 가위, 비겼습니다.";
			}
				else if (comvalue==2) {
					result = "사용자는 가위, 컴퓨터는 바위, 졌습니다.";
			}	
				else {
					result = "사용자는 가위, 컴퓨터는 보, 이겼습니다.";
			}
			break;
		case 2:
			if (comvalue==1) {
				result = "사용자는 바위, 컴퓨터는 가위, 졌습니다.";
			}
			else if (comvalue==2) {
				result = "사용자는 바위, 컴퓨터는 바위, 비겼습니다.";
		}	
			else {
				result= "사용자는 바위, 컴퓨터는 보,졌습니다.";
		}
			break;
		case 3:
			if (comvalue==1) {
				result = "사용자는 보, 컴퓨터는 가위, 졌습니다.";
			}
				else if (comvalue==2) {
				result = "사용자는 보, 컴퓨터는 바위, 이겼습니다.";
			}	
				else {
				result = "사용자는 보, 컴퓨터는 보, 비겼습니다.";
			}
			break;

		default: result =  "1~3까지 숫자만 입력바랍니다.";
			break;
		}
		
		//--------------결과가 보여지는 구문----syso를 한번만 써라.--------------------------------
		System.out.println(result);
	}
}
