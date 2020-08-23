package day_200823;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 색종이 
public class acm_2563 {
	// 전체 넓이 영역 
	static final int[][] arr = new int[101][101];
	
	public static void main(String[] args) throws Exception {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		for(int i=0; i<cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());// + 10 
			int y =  Integer.parseInt(st.nextToken());// + 10
			
			setArr(x,y);
		}
		int sum = 0;
		
		// 전체 영역에서 검은색 색종이 영역의 합을 구함. 
		for(int i=1; i<=100; i++) {
			for(int j=1;j<=100; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
	
	public static void setArr(int x, int y) {
		// 검은색 색종이 영역을 1로 표시 
		for(int i=x; i<x+10; i++) {
			for(int j=y; j<y+10; j++) {
				if(arr[i][j] == 0) arr[i][j] = 1;
			}
		}
	}

}
