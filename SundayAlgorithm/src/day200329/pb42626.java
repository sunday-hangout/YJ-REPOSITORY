package day200329;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.jupiter.api.Test;

// 더 맵게
public class pb42626 {

	public int solution(int[] scoville, int K) {
		 int mixCount = 0;
		 int size = scoville.length;
		 
		 // scoville 1개의 경우
		 if(size == 1 && scoville[0] >= K) return 0;
		 if(size == 1 && scoville[0] < K) return -1;
		 
		 // Intger 타입의 PriorityQueue는 오름차순으로 정렬해준다.
		 Queue<Integer> que = new PriorityQueue<Integer>();
		 for(int s : scoville)
			 que.offer(s);
		 
		 while(que.size() > 1) {
			 if(que.peek() >= K)
				 break;
			 
			 int first = que.poll();
			 int second = que.poll();
			 
			 que.offer(first + 2 * second);
			 mixCount ++;
		 }
		 
		 // 마지막 남은 스코빌 지수를 체크
		 if(que.poll() < K) return -1;
		 
		 return mixCount;
	}
	
	@Test
	public void test() {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println(solution(scoville, K));
		assertEquals(2, solution(scoville, K));
	}
}
