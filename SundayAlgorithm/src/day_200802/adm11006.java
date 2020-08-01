package day_200802;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class adm11006 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testNum = Integer.parseInt(br.readLine());
		for(int i=0; i<testNum; i++) {
			solution(br.readLine());
		}
	}
	
	public static void solution(String str) {
		String[] arr = str.split(" ");
		int legs = Integer.parseInt(arr[0]);
		int cnt = Integer.parseInt(arr[1]);
		
		int u = cnt * 2 - legs;
		int t = cnt - u;
		
		StringBuilder sb = new StringBuilder();
		sb.append(u + " " + t);
		System.out.println(sb.toString());
	}
}
