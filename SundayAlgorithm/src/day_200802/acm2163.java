package day_200802;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acm2163 {

	public static void main(String[] args) throws Exception{
		int answer = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = br.readLine().split(" ");
		
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);
		int min = Math.min(N,M);
		int max = Math.max(N,M);
		
		if(min == 1) {
			answer = max - 1;
		} else {
			answer += (min - 1) + (min) * (max - 1); // (2-1) + (2) * (2-1)
		}
		System.out.println(answer);
	}
}
