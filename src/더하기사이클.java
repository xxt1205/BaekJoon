
import java.util.Scanner;

public class 더하기사이클 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,B;
		
			A = sc.nextInt();
			B = sc.nextInt();
			
			int end = A + B;
			int result = 0;
			int C = 0;
			int count = 0;
			while(end == result) {
				result = A + B;
				B = A;
				if(result < 10) {
					A = result;
					count++;
				}else if(result >= 10) {
					A = result % 10;
					count++;
				}
			}
			System.out.println(count);
		sc.close();
		
	}
}