package day_200614;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// 2016년 
public class pb12901 {
	// 1월 1일 FRI
	public String solution(int a, int b) {
		String[] day = new String[] {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int[] month = new int[] {0,31,29,31,30,31,30,31,31,30,31,30,31};
		
		// 1월1일부터 시작이므로 -1로 시
		int sum = -1;
		for(int i=1; i<a; i++) {
			sum += month[i];
		}
		sum += b;
		sum %= 7;
		
		return day[sum];
	}
	
	@Test
	public void test() {
		//assertEquals("TUE", solution(5,24));
	}
}
