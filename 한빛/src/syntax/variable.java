package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * variable.java/
 * seunghwan.gmail.com
 * story : 변수에 관한 문법
 *
 */
public class variable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("***회원가입***");
		
		System.out.println("아이디 : ");
		String id = scanner.next();
		System.out.println("비밀번호: ");
		String password = scanner.next();
		System.out.println("이름 : ");
		String name = scanner.next();
		System.out.println("생년월일 (예)800101 : ");
		int birthday = scanner.nextInt();
		System.out.println("성인여부(성인true,미성년자false) : ");
		boolean isadult = scanner.nextBoolean(); // 정수는 int
		System.out.println("키(=소수점 1자리까지) : ");
		double height = scanner.nextDouble();
		System.out.println("혈액형(A) : ");
		// char blood = 'A'; 문자 한글자 표지 할때만 사용
		String blood = "A";
		System.out.println(id);
		System.out.println(password);
		System.out.println(name);
		System.out.println(birthday);
		System.out.println(isadult);
		System.out.println(height);
		System.out.println(blood);
	}
}
