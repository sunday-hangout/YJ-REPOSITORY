package day200329;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

// K번째수
public class pb42748 {

	public int[] solution(int[] array, int[][] commands) {
		int row = commands.length;
		int[] answer = new int[row];
		int index = 0;
		
		for(int[] command : commands) {
			int diff = command[1] - command[0];
			int[] arr = new int[diff + 1];
			int idx = 0;
			
			for(int i=command[0]-1; i<command[1]; i++)
				arr[idx ++] = array[i];
			
			Arrays.sort(arr);
			
			answer[index ++] = arr[command[2] -1];
		}
		
		return answer;
	}

	@Test
	 public void test() {
		 int[] array = {1, 5, 2, 6, 3, 7, 4};
		 int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		 
		 assertArrayEquals(new int[] {5, 6, 3}, solution(array, commands));
		
	 }
}
