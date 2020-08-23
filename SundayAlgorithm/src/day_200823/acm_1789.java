package day_200823;

import java.util.*;
// 수들의 합 
public class acm_1789 {

	/*
	 * sum : 200, max : 19 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sum = sc.nextLong();
		
		long cur = 1;
		if(sum == 1) {
			System.out.println(1);
			return;
		}
		sum -= 1;
		// 4 -> 1 2 1 -> 1 3
		// 5 -> 1 2 2 -> 1 4
		while(sum > 0) {
			if(sum > cur) { 
				sum -= ++cur;
			} else {
				System.out.println(cur);
				return;
			}		
		}
		System.out.println(cur);
	}
}
