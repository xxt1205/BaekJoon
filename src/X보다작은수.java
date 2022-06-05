
import java.util.Scanner;

public class X보다작은수 {

	public static void main(String[] args) {
		System.out.println(((double)2/(double)5));
		Scanner sc = new Scanner(System.in);
		
		
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[]A = new int[N];
		for(int i = 0; N > i; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; N > i; i++) {
			if(A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
		
	}
	
}
