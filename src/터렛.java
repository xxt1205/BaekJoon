import java.util.Scanner;

public class 터렛 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int x1=0,x2=0,y1=0,y2=0,r1=0,r2=0;
		for(int i = 0; T > i; i++) {
			 x1 = sc.nextInt();
			 y1 = sc.nextInt();
			 r1 = sc.nextInt();
			 x2 = sc.nextInt();
			 y2 = sc.nextInt();
			 r2 = sc.nextInt();
			
			 System.out.println(distance(x1,y1,r1,x2,y2,r2));
			
		}
		sc.close();

	}
	public static int distance(int x1, int y1, int r1,int x2,int y2,int r2) {
		
		int d =  (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));
		
		if(x1 == x2 && y2 == y1 && r1 == r2) {
			return -1;
		}else if(Math.pow(r1 + r2, 2) < d ) {
			return 0;
		}else if(Math.pow(r1 - r2, 2) > d) {
			return 0;
		}else if(Math.pow(r1 + r2, 2) == d) {
			return 1;
		} else if(Math.pow(r1 -r2, 2) == d) {
			return 1;
		} else {
			return 2;
		}
	}

}
