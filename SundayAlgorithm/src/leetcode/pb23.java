package leetcode;

class pb23 {
    static List<Integer> list = new ArrayList();
    public ListNode mergeKLists(ListNode[] lists) {
        list = new ArrayList();
        for(ListNode node : lists) {
            getValue(node);
        }
        
        Collections.sort(list);
        
        ListNode answer = new ListNode(0);
        ListNode temp = answer;
        
        for(int i=0; i<list.size(); i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return answer.next;
    }
    
    public void getValue(ListNode node) {
        while(node != null) {
            list.add(node.val);
            node = node.next;
        }
    }
}