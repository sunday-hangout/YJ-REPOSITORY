package day_200621;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// 다음 큰 숫자 
public class pb12911 {

	public int solution(int n) {
		int cnt = checkBinaryCnt(n);
		
		while(true) {
			if(checkBinaryCnt(++n) == cnt) return n;
		}
    }
	
	// 2진수의 1의 개수를 세는 함수 
	public int checkBinaryCnt(int num) {
		int cnt = 0;
		while(num > 1) {
			int temp = num;
			num = num / 2;
			if(temp % 2 == 1) cnt ++;
		}
		return cnt;
	}
	
	@Test
	public void test() {
//		78	83
//		15	23
		assertEquals(solution(78), 83);
		assertEquals(solution(15), 23);
	}
}
