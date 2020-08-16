package day_200816;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 하얀칸 
public class acm_1100 {

	/*
	 * 흰 검 흰 검 흰 검 흰 검
	 * 검 흰 검 흰 검 흰 검 흰 
	 * 흰 검 ...
	 * */
	public static void main(String[] args) throws Exception {
		int answer = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<8; i++) {
			String str = br.readLine();
			answer += countWhite(str, i);
		}
		System.out.println(answer);
	}
	
	/*
	 * line 짝 -> 흰돌 짝
	 * line 홀 -> 흰돌 홀
	 *  */
	public static int countWhite(String str, int line) {
		int cnt = 0;
		
		for(int i=0; i<8; i++) {
			if(line % 2 == i % 2 && str.charAt(i) == 'F') cnt ++;
		}
		return cnt;
	}
}
