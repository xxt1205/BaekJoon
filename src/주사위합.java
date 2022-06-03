import java.util.Scanner;

public class 주사위합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,C;
		
		
//		A = sc.nextInt();
//		B = sc.nextInt();
//		C = sc.nextInt();
		A =3;
		B=3;
		C=6;
		
		
		int result = 0;
		if(A == B && B == C ) {
			result = 10000 + A *1000;
		}else if(A == B || A == C) {
			result = 1000 + A * 100;
		}else if(B == C) {
			result = 1000 + B * 100;
		}else  {
			result = Math.max(A, Math.max(B, C));
		}
        System.out.println(result);
	}

}

// <숏코딩>
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in);
//		
//		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
//		int rslt = 0;
//		if (a==b||a==c) {
//			rslt = (b==c) ? 10000+a*1000 : 1000+a*100;
//		} else {
//			rslt = (b==c) ? 1000+b*100  : Math.max(a, Math.max(b, c))*100;
//		}
//		System.out.println(rslt);
//	}
//}