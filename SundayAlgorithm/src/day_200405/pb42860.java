package day_200405;

import org.junit.jupiter.api.Test;

// 조이스
public class pb42860 {
	public int solution(String name) {
		int answer = 0;
		char[] names = name.toCharArray();
		int size = names.length;
		
		for (int i = 0; i < size; i++) {
			if (names[i] == 'A')
				continue;
			int min = Math.min(names[i] - 'A', 'Z' - names[i] + 1);
			answer += min;
		}

		int min = name.length() - 1;

		if (name.contains("A")) {
			int moveCnt = 1;

			for (int i = 1; i < names.length; i++) {
				if (names[i] != 'A') {
					moveCnt = names.length - i;
					break;
				}
			}
			
			if (min > moveCnt)
				min = moveCnt;
			int i = 0;

			while (i < names.length) {
				int endIndex = 0;
				if (names[i] == 'A') {
					endIndex = i + 1;
					while (endIndex < names.length && names[endIndex] == 'A') {
						endIndex++;
					}

					if (endIndex == names.length) {
						moveCnt = i - 1;
					} else
						moveCnt = 1 + (i - 1) * 2 + names.length - 1 - endIndex;

					if (moveCnt < min)
						min = moveCnt;

					i = endIndex + 1;

				} else
					i++;
			}

			if (min > moveCnt)
				min = moveCnt;
		}

		return answer + min;
	}

	@Test
	public void test() {
		System.out.println(solution("JAZ"));
		System.out.println(solution("JEROEN"));
		System.out.println(solution("JAN"));
	}

}
