package day200322;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Test;

// 기능개발
public class pb42586 {

	public int[] solution(int[] progresses, int[] speeds) {		int size = progresses.length;
		Queue<Integer> dayQue = new LinkedList<Integer>();
		ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        for(int i=0; i<size; i++) {
        	int day = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
        	dayQue.add(day);
        }
        
        int publishCount = 0;
        
        while(!dayQue.isEmpty()) {
        	int temp = dayQue.peek();// 앞선 일
        	dayQue.poll();
        	publishCount = 1;
        	
        	// 마지막인지 확인
        	while(!dayQue.isEmpty()) {
        		if(temp >= dayQue.peek()) {// 앞 전 작업 보다 뒷 작업들의 소요일자가 더 작거나 같은 경우
        			dayQue.poll();
        			publishCount ++;
        		} else { // 앞의 작업보다 큰 경우 for문 멈춤
        			break;
        		}
        	}
        	answerList.add(publishCount);
        }
        
        
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++) {
        	answer[i] = answerList.get(i);
        }
        
        return answer;
    }
	
	@Test
	public void test() {
//		int[] progresses = {93,30,55}; // 7 70 45
//		int[] speeds = {1,30,5}; // 7 3 9
//		int[] answer = {2,1};

		int[] progresses = {99,99,99}; // 7 70 45
		int[] speeds = {1,1,1}; // 7 3 9
		int[] answer = {3};
		
		assertArrayEquals(solution(progresses, speeds), answer); 
	}
}
