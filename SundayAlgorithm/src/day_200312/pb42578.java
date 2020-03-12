package day_200312;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.Test;


// 위장
public class pb42578 {
	
	public static int solution(String[][] clothes) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	
		for(String[] str : clothes) {
			String name = str[1];
			int count = 1;
			
			if(map.containsKey(name)) {
				count += map.get(name);
			}
			map.put(name, count);
			continue;
		}
		
		int sum = 1;
		
		for(String name : map.keySet()) {
			sum *= map.get(name) + 1; // 의상 개수 + 1(의상을 걸치지 않는 경우)
		}
		
		// 전부 다 착용을 안할 수는 없으므로 마지막에 -1
		return sum - 1; 
	}
	
	@Test
	public void test() {
		String[][] str1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] str2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		
		assertEquals(solution(str1), 5);
		assertEquals(solution(str2), 3);
	}
	
}
