package day_200823;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 소수 사이클 (시간 초과 ㅠㅠ)
public class acm_2882 {
	static final int[] prime = new int[7500001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		
		setPrime();
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=1; i<=N; i++) {
			list.add(i);
		}
		
		for(int i=1; i<=K; i++) {
			// Pi %= N (N만큼 돌면 제자리)
			
			int cnt = getPrimeByOrder(i) % N;
			
			int square = list.getFirst();// 자리 옮길 대상
			if(cnt != 0) {
				list.removeFirst();
				list.add(cnt, square);
			} else {
				int sec = list.get(1);
				list.remove(1);
				list.addLast(sec);
			}
			
		}
		int idx = list.indexOf(A);
		StringBuilder sb = new StringBuilder();
		
		// idx == firstIdx
		if(idx == 0) {
			sb.append(list.get(1)).append(" ").append(list.getLast());
		} else if(idx == list.size() -1) {
			sb.append(list.get(0)).append(" ").append(list.get(idx-1));
		} else {
			sb.append(list.get(idx+1)).append(" ").append(list.get(idx-1));
		}
		
		System.out.println(sb.toString());
	}
	
	public static int getPrimeByOrder(int num) {
		int answer = 0;
		int count = 0;
		for(int i = 2; i <= 7500000; i++) {
			if (prime[i] == 0) {
				count++;
				if (count == num) {
					answer = i;
					break;
				}
			}
		}
		
		return answer;
	}

	// 8000000 미만 소수 개수 : 539777
	public static void setPrime() {
		for(int i = 2; i*i<= 7500000; i++) {
			if(prime[i*i] != -1) {
				for(int j = i*i; j <= 7500000; j+=i) prime[j] = -1;
			}
		}
	}
}
