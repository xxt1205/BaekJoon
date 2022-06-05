
import java.util.Scanner;

public class 더하기사이클 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,B,I;
		
//			A = sc.nextInt();
//			B = sc.nextInt();
			I = 1;
			
			String str = String.valueOf(I);
			A = 0;
			B = 0;
			if(I >=10) {
				A = str.charAt(0) - '0';
				B = str.charAt(1) - '0';
			}else if(10 > I) {
				A = 0;	
				B = str.charAt(0) - '0';
			}
			
			int result = 0;
			int C = 0;
			int count = 0;
			int x = A;
			int y = B;
			
			
			do {
				
				System.out.println(x+","+y);
				result = A + B;
				System.out.println("result : "+result);
				
				if(result < 10) {
					C = result;
					count++;
					
				}else if(result >= 10) {
					C = result % 10;
					count++;
					
				}
				A = B;
				
				B = C;
				
				System.out.println("count: " + count);
				System.out.println("A : " + A);
				System.out.println("B : "+ B);
				System.out.println("x : " + x);
				System.out.println("y : " + y);
			}while(x != A || y != B) ;
			System.out.println(count);
		
		
	}
}