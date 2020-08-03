package day_200802;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class acm1764 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<String>();
		String[] cnt = br.readLine().split(" ");// 3 4
		int n = Integer.parseInt(cnt[0]);//3
		int m = Integer.parseInt(cnt[1]);//4
		Set<String> set = new HashSet<String>();
		
		/*
		ohhenrie
		charlie
		baesangwook
		*/
		while(n-- >0) {
			set.add(br.readLine());
		}
		/*
		obama
		baesangwook
		ohhenrie
		clinton
		*/
		while(m -- > 0) {
			String name = br.readLine();
			if(set.contains(name)) {
				list.add(name);
			}
		}
		
		/*
		 * list 
		 * baesangwook
		 * ohhenrie
		 * */
		Collections.sort(list);
		
		System.out.println(list.size());
		if(list.size() != 0) list.forEach(item -> System.out.println(item));
	}
	
}
