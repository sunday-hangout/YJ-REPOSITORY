package day_200823;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수 쌍 
public class acm_1017 {
	static int[] prime = new int[2001];
	
	// 하나라도 소수 :합이 소수 
	public static void main(String[] args) throws Exception {
		setPrime();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = br.read();
		int[] num = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) num[i] = Integer.parseInt(st.nextToken());
			
		// 소수 소수아닌것 개수세서 짝 
		
	}
	
	public static void setPrime() {
		for(int i=2; i<=2000; i++) {
			for(int j=i*i; j<=2000; j+=i) {
				prime[j] = -1;
			}
		}
	}
	
}
