package day_200614;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

// 튜플
public class pb64065 {

	public int[] solution(String s) {
		// "{{1,2,3},{2,1},{1,2,4,3},{2}}"
		s = s.replace("},{", "-"); // "{{1,2,3 - 2,1 - 1,2,4,3 - 2}}"
		s = s.replace("{", "").replace("}", "").replace("\"", "");// 1,2,3 - 2,1 - 1,2,4,3 - 2
		
		String[] arr = s.split("-");
		// 길이 짧은 원소부터 
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String o1, String o2) {return o1.length() - o2.length();};
		});
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(String str : arr) {
			String[] temp = str.split(",");
			
			for(String i : temp) {
				int num = Integer.parseInt(i);
				if(!list.contains(num)) list.add(num);
			}
		}
		
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) answer[i] = list.get(i);
		
        return answer;
    }
	
	@Test
	public void test() {
		String s = "\"{{2},{2,1},{2,1,3},{2,1,3,4}}\"";
		int[] result = new int[] {2,1,3,4};
		
		assertArrayEquals(solution(s), result);
	}
}
