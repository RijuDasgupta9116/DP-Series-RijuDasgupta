package dp;

import java.util.Scanner;

public class StairCase {
	public static int stairCaseRecursive(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		if(n == 2) {
			return n;
		}
		
		int ans1 = stairCaseRecursive(n-1);
		int ans2 = stairCaseRecursive(n-2);
		int ans3 = stairCaseRecursive(n-3);
		int myAns = ans1+ans2+ans3;
//		return stairCaseRecursive(n-1)+stairCaseRecursive(n-2)+stairCaseRecursive(n-3);
		return myAns;
	}
	public static int stairCaseRecursiveDP(int n, int[]dp) {
		if(n == 0 || n == 1) {
			return 1;
		}
		if(n == 2) {
			return n;
		}
		int ans1,ans2,ans3;
		if(dp[n] == -1) {
			ans1 = stairCaseRecursiveDP(n-1,dp);
			dp[n-1] = ans1;
		}
		else {
			ans1 = dp[n-1];
		}
		
		if(dp[n] == -1) {
			ans2 = stairCaseRecursiveDP(n-2,dp);
			dp[n-2] = ans2;
		}
		else {
			ans2 = dp[n-2];
		}
		
		if(dp[n] == -1) {
			ans3 = stairCaseRecursiveDP(n-3,dp);
			dp[n-3] = ans3;
		}
		else {
			ans3 = dp[n-3];
		}
		int myAns = ans1+ans2+ans3;
		return myAns;
		
	}
	
	public static long iterativeDp(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		if(n == 2) {
			return n;
		}
		long[] dp = new long[n+1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i=3;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
		}
		return dp[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int ans = stairCaseRecursive(10);
//		System.out.println(ans);
		int dp[] = new int[n+1];
		for(int i=0;i<dp.length;i++) {
			dp[i] = -1;
		}
//		int ans = stairCaseRecursiveDP(n, dp);
		long ans = iterativeDp(n);
		System.out.println(ans);
	}

}
