package day200329;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

// 가장 큰 수
public class pb42746 {

	public String solution(int[] arr) {
		StringBuffer sb = new StringBuffer();
		int size = arr.length;
		String[] str = new String[size];
		int idx = 0;
		
		for (int a : arr) {
			str[idx++] = String.valueOf(a);
		}		
		
		Arrays.sort(str, new MyComp());
		
		// 전체가 0인 배열의 경우에는 0을 리턴 
		if(str[0].equals("0")) return "0";
		
		for(String s : str)
			sb.append(s);
		
		return sb.toString();
	}

	@Test
	public void test() {

		int[] numbers1 = { 6, 10, 2 };
		int[] number2 = { 3, 30, 34, 5, 9 };

		assertEquals(6210, solution(numbers1));
		assertEquals(9534330, solution(number2));
	}

}

// 내림차순의 순으로 정렬
class MyComp implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		return (o2 + o1).compareTo(o1 + o2);
	}
}
