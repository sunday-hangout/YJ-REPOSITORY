package day200315;

import java.util.Arrays;

//완주하지 못한 선수
public class pb42576 {
	public static void main(String[] args) {
		String str1[] = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String str2[] = {"josipa", "filipa", "marina", "nikola"};
		
		System.out.println(solution(str1, str2));
	}
	// participant -1 = completion
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		String answer = participant[participant.length - 1];
		
		for(int i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		
		return answer;
	}
}

