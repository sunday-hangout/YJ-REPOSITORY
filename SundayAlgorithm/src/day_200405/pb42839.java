package day_200405;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

// 소수 찾기
public class pb42839 {

	public int solution(String numbers) {
		char[] list = numbers.toCharArray();
		int[] combArr = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			combArr[i] = Integer.parseInt(String.valueOf(list[i]));
		}
		Set<Integer> primeList = new HashSet<>();
		for (int i = 1; i <= list.length; i++) {
			perm(list, 0, i, primeList);
		}

		return primeList.size();
	}

	public void perm(char[] arr, int depth, int k, Set primeList) {
		if (depth == k) {
			print(arr, k, primeList);
			return;
		} else {
			for (int i = depth; i < arr.length; i++) {
				swap(arr, i, depth);
				perm(arr, depth + 1, k, primeList);
				swap(arr, i, depth);
			}
		}
	}

	public void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void print(char[] arr, int k, Set primeList) {
		StringBuilder a = new StringBuilder();
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i]);
			a.append(arr[i]);
		}
		System.out.println();
		isPrime(primeList, a);
	}

	private void isPrime(Set primeList, StringBuilder a) {
		int b = Integer.parseInt(String.valueOf(a));
		boolean prime = true;
		if (b <= 1) {
			return;
		}
		for (int j = 2; j <= Math.sqrt(b); j++) {
			if (b % j == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			primeList.add(b);
		}
	}



	@Test
	public void test() {
		assertEquals(solution("17"), 3);
		assertEquals(solution("011"), 2);
	}

}
