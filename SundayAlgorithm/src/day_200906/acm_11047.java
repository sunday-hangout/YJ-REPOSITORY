package day_200906;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 동전 0 
public class acm_11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		int answer = 0;
		
		for(int i=N-1; i>=0; i--)
			arr[i] = Integer.parseInt(br.readLine());
		
		int idx = 0;
		while(K >= 0) {
			if(K == 0) break;
		
			if(K < arr[idx]) {
				idx ++;
				continue;
			}
			
			int mok = K/arr[idx];
			answer += mok;
			K %= arr[idx];
		}
		
		System.out.println(answer);
		
		
	}
}
;