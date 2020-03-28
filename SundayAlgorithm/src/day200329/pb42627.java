package day200329;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

// 디스크 컨트롤러
public class pb42627 {

	public int solution(int[][] jobs) {
        //int row = jobs.length;
		Arrays.sort(jobs);
        int curTime = 0;
        
        for(int[] job : jobs) {
        
        }
        
		int answer = 0;
        
        
        
        return answer;
    }
	
	@Test
	public void test() {
		int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
		
		assertEquals(9, solution(jobs));
	}
}
