package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// container-with-most-water
public class pb11 {
public int maxArea(int[] height) {
	int left = 0;
	int right = height.length - 1;
	int max = 0;
	while(left < right) {
		max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
		if(height[left] < height[right]) {
			left ++;
		}else {
			right --;
		}
	}
	
	return max;
}
 
	@Test
	public void test() {
		assertEquals(49, maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
	}
}
