package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

// 3sum
public class pb15 {

	public List<List<Integer>> threeSum(int[] nums) {
		if(nums.length < 3) return new ArrayList<List<Integer>>();
		
		Set<List<Integer>> answer = new HashSet<List<Integer>>();
		Map<Integer, List<Integer>> map = new HashMap<>();
		int idx = 0;
		
		for(int num :nums) {
			List<Integer> list;
			if(map.containsKey(num)) {
				list = map.get(num);
				list.add(idx);
			} else {
				 list = new ArrayList<Integer>();
				 list.add(idx);
			}
			map.put(num, list);
			idx ++;
		}
	
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				List<Integer> temp = new ArrayList<Integer>();
				int x = 0 - (nums[i] + nums[j]);
			
				
				if(map.containsKey(x)) {
					int len = map.get(x).size();
					if(len > 0 && map.get(x).contains(i)) {
						len --;
					}
					if(len > 0 && map.get(x).contains(j)) {
						len --;	
					}
					if(len > 0) {
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(x);
						Collections.sort(temp);
						answer.add(temp);
					}
				} else {
					continue;
				}
			}
		}
		List<List<Integer>> answerList = new ArrayList<List<Integer>>();
		for(List<Integer> l : answer) {
			answerList.add(l);
		}
		return answerList;
    }
	
	@Test
	public void test() {
		int[] nums = new int[] {-1,0,1,2,-1,-4};
		int[] nums1 = new int[] {};
		int[] nums2 = new int[] {0};
		
		System.out.println(threeSum(nums));
		System.out.println(threeSum(nums1));
		System.out.println(threeSum(nums2));
	}
}
