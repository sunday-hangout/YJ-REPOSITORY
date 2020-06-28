package day_200628;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// n진수 게임 
public class pb17687 {
	/*
	 * @param n : 진법 
	 * @param t : 미리 구할 숫자의 개수 
	 * @param m : 게임 참가인원 
	 * @param p : 순서 
	 * */
	public String solution(int n, int t, int m, int p) {
		StringBuilder totalStr = new StringBuilder();
		StringBuilder tubeAnswer = new StringBuilder();
		
		int len = (t-1) * m + p;
		int num = 0;
	
		while(totalStr.length() < len) {
			String str = getNumeralStr(n, num++);
			totalStr.append(str);
		}
		System.out.println(totalStr);
		// 0 부터 시작하므로 -1
		for(int i=0; i<t; i++) {
			int idx = (i*m + p)-1;
			tubeAnswer.append(totalStr.charAt(idx));
		} 
		System.out.println(tubeAnswer.toString());
		return tubeAnswer.toString();
    }

	// 진법 변환 함수
	public String getNumeralStr(int base, int number) {
		StringBuffer sb = new StringBuffer();
		if(number == 0) return "0";
		
		
		while(number >= base) {
			sb.append(number % base < 10 ? Integer.toString(number % base) : Character.toString((char) (number % base + 55)));
			number /= base;
		}
		sb.append(number % base < 10 ? Integer.toString(number % base) : Character.toString((char) (number % base + 55)));
		
		return sb.reverse().toString().toUpperCase();
	}
	
	@Test
	public void solutionTest() {
		int n = 2;
		int t = 4;
		int m = 2;
		int p = 1;
		
		//assertEquals("0111", solution(n, t, m, p));
		int n1 = 16;
		int t1 = 16;
		int m1 = 2;
		int p1 = 1;
		
		//assertEquals("02468ACE11111111", solution(n1, t1, m1, p1));
		
		int n2 = 16;
		int t2 = 16;
		int m2 = 2;
		int p2 = 2;
		
		assertEquals("13579BDF01234567", solution(n2, t2, m2, p2));
	}
	
	@Test
	public void getNumeralStrTest() {
		int num1 = 5;
		int num2 = 10;
		int num3 = 10;
	
		assertEquals("101", getNumeralStr(2, num1));
		assertEquals("101", getNumeralStr(3, num2));
		assertEquals("A", getNumeralStr(16, num3));
	}
}
