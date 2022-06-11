import java.util.Scanner;

public class 평균은넘겠지 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int C = sc.nextInt();
		
		for (int i = 0; C > i; i++) {
			int N = sc.nextInt();
			int[] score = new int[N];
			double sum = 0;
			
			for (int j = 0; N > j; j++) {
				score[j] =sc.nextInt();
				sum += score[j];
				
			}

			double avg = (sum / N);
			double count = 0;
			for (int x = 0; N > x; x++) {
				if (avg < (double) score[x]) {
					count++;
				}
			}
			System.out.println("count = " + count);
			System.out.printf("%.3f%%\n", (count /N)*100 );
		}
		sc.close();
		
	

	}

}
