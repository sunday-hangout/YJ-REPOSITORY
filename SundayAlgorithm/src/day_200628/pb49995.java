package day_200628;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//쿠키 구입 
public class pb49995 {

	public int solution(int[] cookie) {
		int cookieCnt = cookie.length;
		int cookieSum = 0;
		
		// 바구니 2개 미만인 경우 구매 불가능 
		if(cookieCnt < 2) return 0;
		
		// 바구니 개수가 2개면 두개의 쿠키 수가 동일해야한다. 
		if(cookieCnt == 2) {
			if(cookie[0] == cookie[1]) return cookie[0];
			return 0;
		}
		
		// 기준이 되는 i 를 증가시키며 쿠키의 합 비교 
		for(int m=0; m<cookieCnt-1; m++) {
			int firstSum = cookie[m];// 큰아들 쿠키 합 (왼쪽 배열합)
			int secSum = cookie[m+1];// 작은아들 쿠키 합 (오른쪽 배열합)
			
			int firstIdx = m;
			int secIdx = m+1;
			
			while(true) {
				// 쿠키의 합이 같은 같고 이전 max 값보다 합이 크면 max 갱신 
				if(firstSum == secSum) cookieSum = Math.max(firstSum, cookieSum);
				
				// 오른쪽 배열합이 더 큰 경우 -> 왼쪽을 늘려준다. 
				if(firstIdx > 0 && firstSum <= secSum) {
					firstSum += cookie[--firstIdx];
					continue;
				} 
				
				// 왼 배열합이 더 큰 경우 -> 오른쪽을 늘려준다.
				if(secIdx < cookieCnt-1 && firstSum >= secSum) {
					secSum += cookie[++secIdx];
					continue;
				}
				
				break;
				
			}
		}
		return cookieSum;
    }
	
	@Test
	public void coookieMaxTest() {
		int[] cookie1 = new int[] {1,1,2,3};
		int result1 = 3;
		
		assertEquals(solution(cookie1), result1);
		
		int[] cookie2 = new int[] {1,2,4,5};
		int result2 = 0;
		
		assertEquals(solution(cookie2), result2);
	}
}
