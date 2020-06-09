package day_200614;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.Test;

// 크레인 인형뽑기 게임
public class pb64061 {
	int answer = 0;
	Stack<Integer> stack = new Stack<>();

	public int solution(int[][] board, int[] moves) {
		int arrLength = board[0].length;

		for (int move : moves) {
			move -= 1;
			for (int i = 0; i < arrLength; i++) {
				if (board[i][move] != 0) {
					// stack에 넣고나서 인형 터트릴 수 있는지 체크
					checkBasket(board[i][move]);
					board[i][move] = 0;// stack 에 넣어준 후 0으로 초기화

					break;
				}
			}
		}
		return answer;
	}


	public void checkBasket(int doll) {
		// top과 동일하면 answer + 2
		if (!stack.empty() && stack.peek() == doll) {
			answer += 2;
			stack.pop();
		} else {// 동일하지 않으면 stack에 추가
			stack.add(doll);
		}
	}

	@Test
	public void test() {
		int[][] board = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = new int[] { 1, 5, 3, 5, 1, 2, 1, 4 };
		int answer = 4;

		assertEquals(answer, solution(board, moves));
	}
}
