package day_200621;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.Test;

// 올바른 괄호 
public class pb12909 {
	
	/*
	// 스택사용시 효율성 검사에서 탈락 
	boolean solution(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		char[] arr = s.toCharArray();
		
		for(char ch : arr) {
			// 이전 스택 확인
			if(ch == ')') {
				// 스택이 비어있을 때 ) 가 먼저들어오면 올바르지 않은 괄호 
				if(stack.empty()) return false;
				
				// ( ) 이 만나면 짝이되므로 스택에서 꺼낸다. 
				if(stack.peek() == '(') {
					stack.pop();
					continue;
				}
			}
			// 짝이 아닌 경우 stack에 add 
			stack.add(ch);
			continue;
		}
		
		if(stack.empty()) return true;
		return false;
	}
	*/
	
	boolean solution(String s) {
		char[] arr = s.toCharArray();
		int result = 0;
		
		for(char ch : arr) {
			// 이전 스택 확인
			if(ch == ')') {
				// 스택이 비어있을 때 ) 가 먼저들어오면 올바르지 않은 괄호 
				if(result == 0) return false;
				
				if(result > 0) result --;
			} else {
				result ++;
			}
		}
		
		if(result == 0) return true;
		return false;
	}
	
	@Test
	public void test() {
		String str1 = "()()";
		String str2 = "()(())";
		String str3 = "(())()";
		String str4 = ")()(";
		String str5 = "(()(";
		
		assertEquals(true, solution(str1));
		assertEquals(true, solution(str2));
		assertEquals(true, solution(str3));
		assertEquals(false, solution(str4));
		assertEquals(false, solution(str5));
	}
}
