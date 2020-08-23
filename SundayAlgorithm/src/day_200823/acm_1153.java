package day_200823;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// 네 개의 소수 
public class acm_1153 {
	final static int[] prime = new int[1000001];
	
	// 짝수 한 쌍 만들고 각각 골드바흐의 추측을 적용 
	public static void main(String[] args) throws Exception {
		setPrime();
		ArrayList<Integer> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		if(num < 8) {
			System.out.println(-1);
			return;
		} else{
			// 짝수 쌍 만들기
			if(num % 2 == 1) {// 홀
				list.add(2);
				list.add(3);
				list.addAll(goldBach(num - 5));
			} else { // 짝
				list.add(2);
				list.add(2);
				list.addAll(goldBach(num - 4));
			}
			
			Collections.sort(list);
			StringBuilder sb = new StringBuilder();
			for(int n : list)
				sb.append(n + " ");
			System.out.println(sb.toString().trim());
		}
	}
	
	public static ArrayList<Integer> goldBach(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=2; i<=num/2; i++) {
			if(prime[i] == 0 && prime[num-i] == 0) {
				list.add(i);
				list.add(num-i);
				break;
			}
		}
		return list;
	}
	
	public static void setPrime() {
		for(int i=2; i*i<=1000000; i++) {
			for(int j=i*i; j<=1000000; j+=i) {
				prime[j] = -1;
			}
		}
	}
	
}
