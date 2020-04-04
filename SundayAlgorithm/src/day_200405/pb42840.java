package day_200405;

import java.util.ArrayList;

// 모의고사
public class pb42840 {

	public int[] solution(int[] answers){
		int[] person1 = {1,2,3,4,5};
		int[] person2 = {2,1,2,3,2,4,2,5};
		int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] count = {0,0,0};
        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == person1[i%5]){
                count[0] ++;
            }
            if(answers[i] == person2[i%8]){
                count[1] ++;
            }
            if(answers[i] == person3[i%10]){
                count[2] ++;
            }
        }
        
        int max = count[0];
        for(int i=0; i<3; i++) {
        	max = Math.max((Math.max(count[0], count[1])), count[2]);
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<3; i++) {
        	if(count[i] == max) {
        		arr.add(i);
        	}
        }
        int[] answer = new int[arr.size()];
       
        for(int i=0; i<arr.size(); i++) {
        	answer[i] = arr.get(i) + 1;
        }
        
        return answer;
    }
}
