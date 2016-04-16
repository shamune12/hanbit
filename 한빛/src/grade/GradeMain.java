package grade;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * GradeMain.java/
 * seunghwan.gmail.com
 * story : 성적표 프로그램
 * @author USER
 *
 */
public class GradeMain {
	/**
	 [문제] 
	 과목별 점수를 입력받아 총점, 평균 학점을 구하는 프로그램을 완성하시오.
	 (과목을 국, 영, 수)
	 */
	public static void main(String[] args) {
		
		// ----- 변수 선언 영역 ------------
		Scanner scanner = new Scanner(System.in);
		Grade grade = new Grade();
		int kor=0, eng=0, math=0, total=0, avg=0;
		String name = "";
		//---------파라미터 입력 영역-------
		System.out.println("이름 : [],국어 : [], 영어 : [], 수학 : []'를 입력하시오");
		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		//--------메소드 호출------
		total = grade.getTotal(kor, eng, math);
		avg = grade.getAvg(total);
		//----------리턴값 출력 영역--------
		System.out.println(name+"의 총점은 "+total+"이고, 평균은 "+avg+" 이다. *");
		
	}
}
