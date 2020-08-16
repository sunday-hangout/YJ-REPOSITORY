package day_200816;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 보물 
public class amc_1026 {

	public static void main(String[] args) throws Exception {
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) A.add(sc.nextInt());
		for(int i=0; i<N; i++) B.add(sc.nextInt());
		
		Collections.sort(A);
		Collections.sort(B);
		Collections.reverse(B);
		
		for(int i=0; i<N; i++) answer += A.get(i) * B.get(i);
		System.out.println(answer);
		
	}

}