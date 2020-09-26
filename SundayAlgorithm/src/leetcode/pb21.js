/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */

/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
    let array = [];
    while(l1 || l2) {
        if(l1) {
            array.push(l1.val);
            l1 = l1.next;
        }
        if(l2) {
            array.push(l2.val);
            l2 = l2.next;
        }
    }
    
    array.sort((a,b) => a - b);
    if(array.length === 0) return null;
    
    let answer = new ListNode(0);
    let temp = answer;
    
    for(var i=0; i<array.length; i++) {
        temp.next = new ListNode(array[i]);
        temp = temp.next;
    }
    
    return answer.next;
};

