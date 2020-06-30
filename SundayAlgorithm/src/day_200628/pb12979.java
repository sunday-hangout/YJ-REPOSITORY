package day_200628;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// 기지국 설치 
public class pb12979 {

	public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int idx = 0;
        int location = 1;
        
        while(location<=n) {
            if(idx<stations.length && location >= stations[idx]-w) {
                location = stations[idx]+w+1;
                idx++;
            }else {
                location += 2*w+1;
                answer++;
            }
        }
        return answer;
    }
	@Test
	public void test() {
		int n = 11;
		int[] stations = new int[] {4,11};
		int w = 1;
		
		assertEquals(solution(n, stations, w), 3);
		
		
//		int n = 16;
//		int[] stations = new int[] {9};
//		int w = 2;
//		
//		assertEquals(solution(n, stations, w), 3);
	}
}


