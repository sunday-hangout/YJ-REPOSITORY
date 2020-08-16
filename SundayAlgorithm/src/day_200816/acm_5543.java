package day_200816;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 상근날드 
public class acm_5543 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] burgers = new int[3];
		int[] drinks = new int[2];
		
		for(int i=0; i<3; i++) {
			burgers[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<2; i++) {
			drinks[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(burgers);
		Arrays.sort(drinks);
		
		System.out.println(burgers[0] + drinks[0] - 50);
	}
}
