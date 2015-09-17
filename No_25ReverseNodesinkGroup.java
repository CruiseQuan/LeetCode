/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
//分治递归的方法每次递归翻转k个结点
    public ListNode reverseKGroup(ListNode head, int k) {
	    ListNode curr = head;
	    int count = 0;
	    while (curr != null && count != k) { // 找到第k+1个结点
	        curr = curr.next;
	        count++;
	    }
	    if (count == k) { // 如果K+1个找到
	        curr = reverseKGroup(curr, k); // 获取翻转后的第k+1结点之后的链表
	        // 将这一段翻转，再链接上第k+1结点之后的链表
	        while (count-- > 0) { 
	            ListNode tmp = head.next; 
	            head.next = curr; 
	            curr = head; 
	            head = tmp; 
	        }
	        head = curr;
	    }
	    return head;
	}
}
