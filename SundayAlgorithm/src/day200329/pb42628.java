package day200329;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Test;

// 이중우선순위큐
public class pb42628 {

	public int[] solution(String[] operations) {
		int size = operations.length;
		Queue<Integer> maxQue = new PriorityQueue<Integer>(Collections.reverseOrder());
		Queue<Integer> minQue = new PriorityQueue<Integer>();
		
		for(int i=0; i<size; i++) {
			String[] operation = operations[i].split(" ");
			String op = operation[0];
			int num = Integer.parseInt(operation[1]);
	
			if(op.equals("I")) {
				minQue.offer(num);
			} else {
				if(!minQue.isEmpty()) {
					if(num == 1) {// 최대 값 삭제 : max que에 모으기
						while(!minQue.isEmpty()) {
							maxQue.offer(minQue.poll());
						}
						
						maxQue.poll();
					} else {// 최소 값 삭제 : min que에 모으기
						while(!minQue.isEmpty()) {
							minQue.offer(maxQue.poll());
						}
						minQue.poll();
					}
				}
			}
		}
		
		if(minQue.isEmpty() && maxQue.isEmpty()) return new int[] {0,0};
		
		minQue.poll(), 
	}

	@Test
	public void test() {
		String[] operations1 = { "I 16","D 1" };
		String[] operations2 = { "I 7","I 5","I -5","D -1"};

		//assertArrayEquals(new int[] { 0, 0 }, solution(operations1));
		assertArrayEquals(new int[] { 7, 5 }, solution(operations2));
	}
}
