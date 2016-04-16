package rps;

import java.util.Scanner;

public class GameRPSMain {
	public static void main(String[] args) {
		System.out.println("***가위바위보 게임***");
		System.out.println("가위:1, 바위:2, 보:3");
		Scanner scanner = new Scanner(System.in);
		int scan = scanner.nextInt();
		String result = "";
		//-------------[데이터 입력]-------------
		
		Gamerps3 gamerps3 = new Gamerps3();
		result = gamerps3.play(scan);
		
		//-------------[데이터 출력]-------------
		
		System.out.println(result);
	}
}
