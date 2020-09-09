package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class pb01 {
	public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
	
	@Test
	public void test() {
		int[] nums = new int[]{2,5,5,11};
		int target = 10;
		int[] arr = new int[] {1,2};
		assertEquals(arr, twoSum(nums, target));
	}
}
