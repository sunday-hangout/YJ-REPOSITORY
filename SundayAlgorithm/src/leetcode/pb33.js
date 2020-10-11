/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    let answer = -1;
    nums.forEach((num, index) => {
        if(target === num) answer = index;
    });
    return answer;
};