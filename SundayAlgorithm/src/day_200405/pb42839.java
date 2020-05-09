package day_200405;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

// 소수 찾기
public class pb42839 {
	public int solution(String numbers) {
	    int maxNum = makeMaxNum(numbers.toCharArray());
	    boolean[] primeNum = findPrimeNum(maxNum);

	    return findMakePossiblePrimeNum(primeNum, maxNum);
	}
	
	// 숫자 카드로 만들 수 있는 가장 큰수 
	private int makeMaxNum(char[] inputNum) {
	    Arrays.sort(inputNum);
	    int len = inputNum.length;
	    for (int i = 0; i < len/2; i++) {
	        char temp = inputNum[i];
	        inputNum[i] = inputNum[len - 1 - i];
	        inputNum[len - 1 - i] = temp;
	    }
	    return Integer.parseInt(new String(inputNum));
	}

	// 제일 큰 수를 찾아 가장 큰 수까지의 소수를 구함
	private boolean[] findPrimeNum(int maxNum) {
	    boolean[] result = new boolean[maxNum + 1];
	    for (int i = 2; i*i<maxNum; i++) {
	    	for (int j = i * 2; j <= maxNum; j += i) {
	    		result[j] = true;
	        }
	        
	    }
	    return result;
	}

	// 숫자 조각으로 만들 수 있는 소수 개수 반환 
	private int findMakePossiblePrimeNum(boolean[] primeNum, int maxNum) {
	    int possiblePrimeNumCount = 0;

	    for (int primeNumIndex = 2; primeNumIndex <= maxNum; primeNumIndex++) {
	        if (!primeNum[primeNumIndex] && isPossible(maxNum, primeNumIndex)) {
	            possiblePrimeNumCount++;
	        }
	    }
	    return possiblePrimeNumCount;
	}
	
	// 소수가 카드 조합으로 만들 수 있는지  
	private boolean isPossible(int maxNum, int primeNum) {
	    int[] numCount = countAvailableNums(maxNum);

	    while(primeNum != 0) {
	        if (numCount[primeNum % 10] <= 0) return false;
	        numCount[primeNum % 10]--;
	        primeNum /= 10;
	    }

	    return true;
	}
	// 숫자 카드에서 사용할 수 있는 숫자를 세는 함수 (0~9) 
	private int[] countAvailableNums(int maxNum) {
	    char[] str = String.valueOf(maxNum).toCharArray();
	    int[] numCount = new int[10];
	    for (int i = 0; i < str.length; i++) {
	        numCount[str[i] - '0']++;
	    }
	    return numCount;
	}
	

	@Test
	public void test() {
		assertEquals(solution("17"), 3);
		assertEquals(solution("011"), 2);
	}

}
