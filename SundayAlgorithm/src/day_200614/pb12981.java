package day_200614;

import static org.junit.Assert.assertArrayEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

// 영어 끝말잇기 
public class pb12981 {

	public int[] solution(int n, String[] words) {
		//["tank, kick, know, wheel, land, dream, mother, robot, tank]
		Set<String> wordSet = new HashSet<>();
		String str = words[0];
		int totCnt = words.length;
		int num = 0;
		int order = 0;
		
		char prev = words[0].charAt(words[0].length()-1);
		wordSet.add(words[0]);
		for(int i=1; i<totCnt; i++) {
			num = 1 + i%n;
			order = 1 + i/n;
			// 앞 단어의 마지막 문자로 시작하지 않는 단어인 경우 
			if(prev != words[i].charAt(0)) return new int[] {num,order};
			
			// 이전에 등장한 단어인 경우 
			if(wordSet.contains(words[i])) return new int[] {num,order};
		
			// 한 글자인 경우 
			if(words[i].length() <= 1) return new int[] {num,order};
			
			prev = words[i].charAt(words[i].length()-1);
			wordSet.add(words[i]);
		}
		
		return new int[] {0,0};
	}
	
	@Test
	public void test() {
		int n = 3;
		String[] words = new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int[] answer = new int[] {3,3};
		assertArrayEquals(answer, solution(n, words));
	}
}
