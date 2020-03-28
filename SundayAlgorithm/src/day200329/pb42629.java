package day200329;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.jupiter.api.Test;

// 라면공장
public class pb42629 {
	public int solution(int stock, int[] dates, int[] supplies, int k) {
		Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
		int answer = 0;
		
		int idx = 0;
        for(int i=0; i<k; i++) {
        	if(idx < dates.length && i == dates[idx])
        		priorityQueue.offer(supplies[idx ++]);
        	
        	if(stock == 0) {
        		stock += priorityQueue.poll();
        		answer ++;
        	}
        	stock -= 1;
        }
        return answer;
    }
	
	@Test
	public void test() {
		int stock = 4;
		int[] dates = {4,10,15};
		int[] supplies = {20,5,10};
		int k = 30;
		
		assertEquals(2, solution(stock, dates, supplies, k));
	}
}

