package day_200816;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 베르트랑 공준 
public class acm_4948 {
	static int[] prime = new int[246913];
	
	public static void main(String[] args) throws Exception {
		setPrime();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) break;
			System.out.println(getPrimeCnt(num));
 		}
	}
	
	public static int getPrimeCnt(int n) {
		int answer = 0;
		for(int i=n+1; i<=2*n; i++) {
			if(prime[i] == 0) answer ++;
		}
		return answer;
	}

	public static void setPrime() {
		for(int i=2; i*i<=246913; i+=1) {
            for(int j=i*i; j<=246913; j+=i) {
            	prime[j] = -1;
            }
        }
	}
}
