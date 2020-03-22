package day200322;

import java.util.ArrayList;
import java.util.Stack;

// 쇠막대기
public class pb42585 {

	public int solution(String arrangement) {
		int answer = 0;
		String replaceStr = arrangement.replace("()", "0");
		int size = replaceStr.length();
		
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0; i<size; i++) 
			list.add(replaceStr.charAt(i));
        
		Stack<Character> stack = new Stack<Character>();
      
        for(int i = 0; i < size; i++){
            if(list.get(i) == '('){
            	stack.push(list.get(i));
            }else if(list.get(i) == ')'){// 한 쌍을 이루면 stack에서 꺼내고 막대기 개수 +1
            	stack.pop();
                answer += 1;
            }else if(list.get(i) == '0'){ // 0을 만나면 stack크기만큼 막대기 수를 더해준다.
                answer += stack.size();
            }
        }
        return answer;
    }
}
