package day_200802;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class acm1764 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<String>();
		String[] cnt = br.readLine().split(" ");
		int n = Integer.parseInt(cnt[0]);
		int m = Integer.parseInt(cnt[1]);
		Set<String> set = new HashSet<String>();
		
		while(n-- >0) {
			set.add(br.readLine());
		}
		while(m -- > 0) {
			String name = br.readLine();
			if(set.contains(name)) {
				list.add(name);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		if(list.size() != 0) list.forEach(item -> System.out.println(item));
	}
	
}
