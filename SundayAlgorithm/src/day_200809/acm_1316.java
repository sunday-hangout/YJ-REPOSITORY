package day_200809;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 그룹 단어 체커 
public class acm_1316 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int answer = 0;
		while(count-- > 0) {
			String word = br.readLine();
			if(checkGroupWord(word)) answer ++;
		}
		System.out.println(answer);
	}
	
	public static boolean checkGroupWord(String str) {
		char[] arr = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		char prev = arr[0];
		
		for(char ch : arr) {
			if(prev != ch && set.contains(ch)) return false;
			set.add(ch);
			prev = ch;
		}
		return true;
	}
}
