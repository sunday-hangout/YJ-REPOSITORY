package day200315;

// 스택, 큐 > 탑 
public class pb42588 { 
	public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        
        for(int i=heights.length-1; i>=0; i--) {
        	int temp = heights[i];
        	int idx = i-1;
        	
        	while(idx >=0) {
        		if(temp < heights[idx]) {
        			answer[i] = idx+1;
        			break;
        		}
        		idx --;
        	}
        }
        return answer;
    }
}
