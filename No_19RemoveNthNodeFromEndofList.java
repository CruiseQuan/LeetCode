/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int count=0,i=0;
	       ListNode p=head,r=head;
	       while(p!=null){
	    	   count++;
	    	   p=p.next;
	       }
	       if(n==count){
	           head=head.next;
	           return head;
	       }
	       while(r!=null){
	    	   i++;
	    	   if(i==count-n){
	    		   r.next=r.next.next;
	    		   break;
	    	   }
	    	   r=r.next;
	       }
	       return head;
        
    }
}
