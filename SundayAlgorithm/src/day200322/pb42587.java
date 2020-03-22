package day200322;

import java.util.Collections;
import java.util.PriorityQueue;

// 프린터
public class pb42587 {

	public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int p : priorities)
        	pq.offer(p);
        
        while(!pq.isEmpty()) {
        	for(int i=0; i<priorities.length; i++) {
        		if(pq.peek() == priorities[i]) {
        			pq.poll();
        			
        			answer ++;
        			
        			if(location == i) {
        				pq.clear();
        				break;
        			}
        		}
        	}
        }
        
        return answer;
    }
}
