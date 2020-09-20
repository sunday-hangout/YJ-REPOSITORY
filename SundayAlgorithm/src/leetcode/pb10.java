package leetcode;

import java.util.Stack;

import org.junit.jupiter.api.Test;

// regular-expression-matching
public class pb10 {

	public boolean isMatch(String s, String p) {
		Stack<Character> stack = new Stack<Character>();
		char[] arr = s.toCharArray();
		int idx = 0;
		
		while(idx < arr.length) {
			stack.push(arr[idx]);
			idx ++;
		}
		return false;
		
    }
//	String regex = "[^a-z0-9\\.\\_\\-]";
//	new_id = new_id.replaceAll(regex, "");
//	new_id = new_id.replaceAll("[.]{2,}", ".");;
	@Test
	public void test() {
		String s1 = "aa";
		String a1 = "a";
		
		String s2 = "aa";
		String a2 = "a*";
		
		String s3 = "aab";
		String a3 = "c*a*b";
		
		isMatch(a1, a3);
	}
}
