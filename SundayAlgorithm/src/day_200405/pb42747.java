package day_200405;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

// H-Index
public class pb42747 {

	public int solution(int[] citations) {
		int n = citations.length;
		Arrays.sort(citations);
		int citation = 0;
		
		for(int i=0; i<citations.length; i++) {
			if(citations[i] >= n - i) {
				citation = n - i;
				break;
			}
		}
		return citation;
    }
	
	@Test
	public void test() {
		assertEquals(3, solution(new int[] {3, 0, 6, 1, 5}));
	}
}
