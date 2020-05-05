package day_200426;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// 도둑질
public class pb42897 {

    public int solution(int[] money) {
    	int cnt = money.length;
    	int[] dp = new int[cnt-1];// 첫번째 집 도둑질 (마지막 집 도둑질 불가능)
    	int[] dp2 = new int[cnt];// 첫번째 집 도둑질x
    
    	// 첫번째 집 도둑
    	dp[0] = money[0];
    	dp[1] = money[0];// 첫번째 집 훔쳤으니 더해주어야함
    	
    	// 두번째 집 도둑
    	dp2[0] = 0;
    	dp2[1] = money[1];
    	
    	for(int i=2; i<cnt-1;i++){
    		dp[i] = Math.max(dp[i-2] + money[i], dp[i-1]);
    	}
    	
    	for(int i=2; i<cnt;i++){
    		dp2[i] = Math.max(dp2[i-2]+ money[i], dp2[i-1]);
    	}
    	
    	return Math.max(dp[cnt-2],dp2[cnt-1]);
    }
    
    @Test
    public void test() {
    	int[] money = new int[] {1,2,3,1};
    	assertEquals(solution(money), 4);
    }
}
