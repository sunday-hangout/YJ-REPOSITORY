/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    let start = -1;
    let end = -1;
    
    // ASC
    nums.sort(function(a,b) {return a-b;})

    nums.forEach((num, index) => {
        if(num === target) {
            if(start === -1) {
                start = index;
            } else {
                end = index;
            }
        }
    });
    if(start !== -1 && end === -1) {
        end = start;
    }
    return [start, end];
};