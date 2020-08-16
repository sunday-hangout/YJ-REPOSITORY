package day_200816;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 새 
public class acm_1568 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int idx = 1;
		int answer = 0;
		
		while(true) {
			N -= idx;
			
			if(N <= idx) {
				idx = 1;
			} else {
				idx ++;
			}
			answer ++;
			if(N == 0 || N < 0) break;
		}
		System.out.println(answer);
	}

}
