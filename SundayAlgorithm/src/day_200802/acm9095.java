package day_200802;

import java.util.Scanner;

public class acm9095 {

	static int[] dp = new int[11];
	
	public static void main(String[] args) {
		makeDp();
		Scanner sc = new Scanner(System.in);
		int testCnt = sc.nextInt();
		for(int i=0; i<testCnt; i++) {
			int n = sc.nextInt();
			System.out.println(dp[n]);
		}
	}
	
	public static void makeDp() {
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;// 1+1 , 2
		dp[3] = 4;// dp[2] + dp[1] , dp[3]
		
		for(int i=4; i<11; i++)
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		
		
	}
}
