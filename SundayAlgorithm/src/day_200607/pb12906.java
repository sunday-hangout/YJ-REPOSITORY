package day_200607;

import java.util.HashSet;
import java.util.Iterator;

// 같은 숫자는 싫어
public class pb12906 {
	public int[] solution(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int num : arr)
			set.add(num);
		
		int len = set.size();
		int[] answer = new int[len];
		
		Iterator<Integer> it = set.iterator();
		int idx = 0;
		
		while(it.hasNext()) {
			answer[idx] = it.next();
		}
		
		return answer;
	}
}
