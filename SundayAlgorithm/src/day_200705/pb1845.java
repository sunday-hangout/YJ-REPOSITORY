package day_200705;

import java.util.HashSet;
import java.util.Set;

// 폰켓몬 
public class pb1845 {
	public int solution(int[] nums) {
		Set<Integer> set = new HashSet<>();
		
		for(int num : nums)
			set.add(num);
		
		return set.size() > nums.length/2 ? nums.length/2 : set.size();
    }
}
