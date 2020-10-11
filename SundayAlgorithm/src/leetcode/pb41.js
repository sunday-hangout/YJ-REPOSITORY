/**
 * @param {number[]} nums
 * @return {number}
 */
var firstMissingPositive = function(nums) {
    if (nums.length <= 1)  return nums[0] == 1 ? 2 : 1;
    
    const max = Math.max(...nums);
    
    for (let i = 1; i <= max + 1; i++) {
        if (!nums.includes(i)) return i;
    }
    return 1;
  };