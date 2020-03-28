package day200315;

import java.util.Arrays;

//해시 > 전화번호 목록
public class pb42577 {

	public static void main(String args[]) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		
		System.out.println(solution(phone_book));
	}
	/*
	 * 전화번호부를 오름차순으로 정렬한 후
	 * 이중 for문을 사용하여 비교한다.
	 * startsWith를 사용하여 비교
	 */
	public static boolean solution(String[] phone_book) {
     boolean answer = true;
     Arrays.sort(phone_book);//정렬
     
     if(phone_book.length == 1) return false;
     
     for(int i=0; i<phone_book.length-1; i++) {
     	for(int j=i+1; j<phone_book.length; j++) {
     		// 정렬한 후이므로 뒤의 단어들에 앞의 단어가 포함되는지만 확인하면 된다.
     		if(phone_book[j].startsWith(phone_book[i])) return false;
      	}
     }
     
     return answer;
 }
}

