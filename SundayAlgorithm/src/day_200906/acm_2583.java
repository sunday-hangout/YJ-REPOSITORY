package day_200906;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 영역 구하기 
public class acm_2583 {
	static int sum = 1;
	static int[][] map;
	static int[] X = { -1, 0, 1, 0 };
	static int[] Y = { 0, 1, 0, -1 };
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		List<Integer> list = new ArrayList<>();

		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		map = new int[M][N];
		boolean[][] checked = new boolean[M][N];

		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int startX = Integer.parseInt(st.nextToken());
			int startY = Integer.parseInt(st.nextToken());

			int endX = Integer.parseInt(st.nextToken());
			int endY = Integer.parseInt(st.nextToken());
			
			for (int x = startX; x < endX; x++) {
				for (int y = startY; y < endY; y++) {
					map[y][x] = 1;
				}
			}
		}

		int answer = 0;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] != 1)
					continue;

				dfs(map, checked, i, j);
				answer ++;
				list.add(sum);
				sum = 1;
			}
		}
		StringBuffer sb = new StringBuffer();
		System.out.println(answer);
		for(int a : list)
			sb.append(a + " ");
		System.out.println(sb.toString().trim());
	}

	public static void dfs(int[][] map, boolean[][] checked, int x, int y) {
		checked[x][y] = true;
		map[x][y] = 0;

		for (int i = 0; i < 4; i++) {
			int nextX = x + X[i];
			int nextY = y + Y[i];
			
			if (nextX < 0 || nextY < 0 || nextX >= checked.length || nextY >= checked.length)
				continue;
			
			if (checked[nextX][nextY])
				continue;
			
			
			if (map[nextX][nextY] == 0) {
				checked[nextX][nextY] = true;
				continue;
			}

			dfs(map, checked, nextX, nextY);
			sum++;
		}

	}

}
