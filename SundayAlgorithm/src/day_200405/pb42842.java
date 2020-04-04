package day_200405;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

// 카펫
public class pb42842 {
	
//	red =(x-2) * (y-2) = xy -2x -2y + 4
//	brown = 2 * (x-2) + 2 * y; = 2x -4 + 2y
// brown + red = xy -2x -2y +4 + 2x -4 + 2y = xy
	
	// brown + 4 = 2 * (x + y)
	// brown + red = xy
	
    public int[] solution(int brown, int red) {
        int[] answer = new int[2];
        int xy = brown + red;
        int x = xy/1;
        
        for(int y=2; y*y<=xy;y++) {
        	if(xy % y == 0) {
        		x = xy/y;
        		if(x + y == 2+brown/2) break;
        	}
        }
        answer[0] = x;
        answer[1] = xy/x;
        
        return answer;
    }

    
    @Test
    public void test() {
    	assertArrayEquals(new int[] {4,3}, solution(10, 2));
    	assertArrayEquals(new int[] {3,3}, solution(8, 1));
    	assertArrayEquals(new int[] {8,6}, solution(24, 24));
    }
}

