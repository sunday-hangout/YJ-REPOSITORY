package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class pb05 {

	public static void main(String[] args) {
		String a = "ab";
		System.out.println(a.substring(0,1));
		System.out.println(a.substring(0,3));
	}
	
	public String longestPalindrome(String s) {
		int len = s.length();
		if(s == null || s.length() == 0 || s.length() == 1) return s;
		
		String maxStr = "";
		int maxLen = 1;
		boolean[][] checked = new boolean[len+1][len+1];

		for(int i=0; i<len-1; i++) {
			for(int j=maxLen; i+j<=len; j++) {
				if(checked[i][j] == false && palindromicStr(s.substring(i,i+j)) && j > maxLen) {
					maxLen = j;
					maxStr = s.substring(i, i+j);
					checked[i][j] = true;
				}
			}
		}
		if(maxLen == 0 || maxLen == 1) {
			return Character.toString(s.charAt(0));
		} else {
			return maxStr;
		}
	}
	/* 시간초과 
	public String longestPalindrome(String s) {
		int len = s.length();
		if(s.length() == 0 || s.length() == 1) return s;
		
		String maxStr = "";
		int maxLen = 1;

		for(int i=0; i<len-1; i++) {
			for(int j=maxLen; i+j<=len; j++) {
				if(palindromicStr(s.substring(i,i+j)) && j > maxLen) {
					maxLen = j;
					maxStr = s.substring(i, i+j);
				}
			}
		}
		if(maxLen == 0 || maxLen == 1) {
			return Character.toString(s.charAt(0));
		} else {
			return maxStr;
		}
    }
	
	*/
	
	public boolean palindromicStr(String str) {
		return str.equals(new StringBuffer(str).reverse().toString());
	}
	
	@Test
	public void test() {
		String str1 = "babad";
		String answer1 = "bab";
		
		String str2 = "cbbd";
		String answer2 = "bb";
		
		String str3 = "ab";
		String answer3 = "a";
		
		String str4 = "tfekavrnnptlawqponffseumswvdtjhrndkkjppgiajjhklqpskuubeyofqwubiiduoylurzlorvnfcibxcjjzvlzfvsvwknjkzwthxxrowidmyudbtquktmyunoltklkdvzplxnpkoiikfijgulbxfxhaxnldvwmzpgaiumnvpdirlrutsqenwtihptnhghobrmmzcsrhqgdgzrvvitzgsolsxjxfeencvpnltxeetmtzlwnhlvgtbhkicivylfjhhfqteyxewmnewhmsnfdyneqoywgsgptwdlzbraksgajciebdchindegdfmayvfkwwkkfyxqjcv";
	
		
		assertEquals(answer1, longestPalindrome(str1));
		assertEquals(answer2, longestPalindrome(str2));
		assertEquals(answer3, longestPalindrome(str3));
		
		System.out.println(longestPalindrome(str4));
	}
}
