package dohyun;
import java.util.Scanner;


public class baekjun11047 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		int N = s.nextInt();
		int K = s.nextInt();
		
		int temp = 0;
		int count = 0;
		
		
		int[]money = new int[N];
		
		for(int i=0; i<N; i++) {
			money[i] = (s.nextInt());
		}
		
		for(int i=money.length-1; i>=0; i--) {
			if(K==0)
				break;
			if(K / money[i] > 0) {
				temp = K / money[i];
				K = K - (money[i] * temp);
				count += temp;
			}
		}
		System.out.println(count);
	}
}
