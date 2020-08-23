package day_200823;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 골드바흐의 추측 
public class acm_9020 {

	static final int prime[] = new int[10001];
	
	public static void main(String[] args) throws Exception{
		setPrime();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		for(int i=0; i<cnt; i++) {
			int sum = Integer.parseInt(br.readLine());
			System.out.println(goldBach(sum));
		}
	}
	
	public static String goldBach(int num) {
		StringBuilder sb = new StringBuilder();
		int min = 0;
		
		// 숫자가 가까워 질 수록 차이는 최소가 된다.
		for(int i=2; i<=num/2; i++) {
			if(prime[i] == 0 && prime[num-i] == 0) {
				min = i;
			}
		}
		return sb.append(min).append(" ").append(num-min).toString();
	}
	
	public static void setPrime() {
		for(int i=2; i<=10000; i++) {
			for(int j=i*i; j<=10000; j+=i) {
				prime[j] = -1;
			}
		}
	}
}
