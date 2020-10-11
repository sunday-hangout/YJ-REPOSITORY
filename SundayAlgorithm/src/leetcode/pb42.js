/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function(height) {
    let left = 0;
    let right = height.length - 1;
    let answer = 0;
    let left_max = 0;
    let right_max = 0;
    
    while(left < right) {
        if(height[left] < height[right]) {
            if(height[left] >= left_max) {
                left_max = height[left];
            } else {
                answer += left_max - height[left];
            }
            left ++;
        } else {
            if(height[right] >= right_max) {
                right_max = height[right]
            } else {
                answer += right_max - height[right];
            }
            --right;
        }
    }
    return answer;
};