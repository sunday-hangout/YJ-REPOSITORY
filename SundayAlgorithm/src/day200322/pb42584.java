package day200322;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

// 주식가격
public class pb42584 {

	 public int[] solution(int[] prices) {
	      int size = prices.length;
	      int[] answer = new int[size]; // 가격이 유지된 시간을 담은 배열
	      
	      int count = 0;
	      
	      for(int i=0; i<size-1; i++) { // 두개씩 비교해야하기 때문에 size-1 만큼 돌린다.
	    	  count = 0;
	    	  
	    	  for(int j=i+1; j<size; j++) {
	    		  if(prices[i] <= prices[j]) { // 가격이 유지되는 경우
	    			  count ++;
	    			  
	    			  // 배열의 끝인 경우
	    			  if(j == size - 1) {
	    				  answer[i] = j - i;
	    				  break;
	    			  }
	    		  } else { // 가격이 떨어진 경우
	    			  answer[i] = j - i; // 유지된 시간 : j-i
	    			  break;
	    		  }
	    	  }
	      }
	      
	      // 마지막 바로 전 array 숫자 확인
	      if(count != 0) {
	    	  answer[size-2] = count;
	      }
	      
	      return answer;
	 }
	 
	 @Test
	 public void test() {
		 int[] prices = {1, 2, 3, 2, 3};
		 int[] answer = {4, 3, 1, 1, 0};
		 assertArrayEquals(solution(prices), answer);
	 }
}