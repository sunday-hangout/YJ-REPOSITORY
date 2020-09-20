package leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class pb19 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode answer;
		ListNode temp = new ListNode(0);
		answer = temp;
		
		ListNode firstNode = new ListNode(0);
		firstNode.next = head;
		int nodeCnt = getNodeCnt(firstNode);
		
		while(nodeCnt > 0) {
			firstNode = firstNode.next;
	           
			if(nodeCnt == n) {
				nodeCnt --;
				continue;
			}
			temp.next = new ListNode(firstNode.val);
			temp = temp.next;
			nodeCnt --;
		}
		return answer.next;
	}
	
	public int getNodeCnt(ListNode head) {
		int cnt = -1;
		
		while(head != null) {
			cnt ++;
			head = head.next;
		}
		return cnt;
	}
	
	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	@Test
	public void test() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		node4.next = node5;
		node3.next = node4;
		node2.next = node3;
		node1.next = node2;
		removeNthFromEnd(node1, 2);
		
		ListNode test = new ListNode(0);
		node3.next = node5;
		node2.next = node3;
		node1.next = node2;
		test.next = node1;
		
		//assertEquals(test.next, removeNthFromEnd(node1, 2));
		
	}
}

