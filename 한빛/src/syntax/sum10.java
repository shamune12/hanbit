package syntax;

/**
 * 2016. 4. 16.
 * sum10.java/
 * seunghwan.gmail.com
 * story : 1부터 10까지의 합
 * @author USER
 *
 */
public class sum10 {
	public static void main(String[] args) {
	int oddsum = 0, evensum=0;
	// sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10; //첫번째 항 = 1 , 10개, 공차 = 1
	
	for (int i =1; i <= 10; i+=2) {
		oddsum += i;
		//System.out.print(i+"\t");
	}
		System.out.println("1부터 10까지의 홀수의 합 =" + oddsum);
	
	for (int i = 2; i <= 10; i+=2) {
		evensum += i;
		//System.out.print(i+"\t");
	}
	
	System.out.println("1부터 10까지의 짝수의 합 =" + evensum);

	}
}
