package day_200405;

// 체육복
public class pb42862 {
	public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n+1];
		for(int r : reserve) {
			arr[r] ++;
		}
		for(int l : lost) {
			arr[l] --;
		}
		
		if(arr[1] == -1) {
			if(arr[2] == 1) {
				arr[1] ++;
				arr[2] --;
			} 
		} 
		
		for(int i=2; i<n; i++) {
			if(arr[i] == -1) {
				if(arr[i-1] == 1) {
					arr[i] ++;
					arr[i-1] --;
					continue;
				} else if(arr[i+1] == 1) {
					arr[i] ++;
					arr[i+1] --;
					continue;
				}
			}
		}
		
		if(arr[n] == -1) {
			if(arr[n - 1] == 1) {
				arr[n] ++;
				arr[n-1] --; 
			}
		}
		
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			//System.out.println(arr[i]);
			if(arr[i] > -1) {
				answer ++;
			}
		}
		
        //System.out.println(answer);
        return answer;
    }
}
