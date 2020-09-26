/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode[]} lists
 * @return {ListNode}
 */
// Merge k Sorted Lists
var array = [];
var mergeKLists = function(lists) {
    for(var i=0; i<lists.length; i++) {
        getValue(lists[i]);
    }
        
    array.sort((a,b) => b-a);
    
    let answer = new ListNode(0);
    let temp = answer;
    
    while(array.length > 0) {
        temp.next = new ListNode(array.pop());
        temp = temp.next;
    }
    return answer.next;
};

function getValue(node) {
    while(node) {
        array.push(node.val);
        node = node.next;
    }
}