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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode pListNode=null,head=null;
	        while(l1!=null&&l2!=null){
	        	if(l1.val<l2.val){
	        		if(head==null){
	        			head=l1;
	        			pListNode=l1;
	        		}else{
	        			pListNode.next=l1;
	        			pListNode=pListNode.next;	        			
	        		}
	        		l1=l1.next;
	        	}else{
	        		if(head==null){
	        			head=l2;
	        			pListNode=l2;
	        		}else{
	        			pListNode.next=l2;
	        			pListNode=pListNode.next;	        			
	        		}
	        		l2=l2.next;
	        	}
	        	
	        }
	        	while(l1!=null){
	        	    if(head==null){
	        			head=l1;
	        			pListNode=l1;
	        		}else{
	        			pListNode.next=l1;
	        			pListNode=pListNode.next;	        			
	        		}
        			l1=l1.next;
	        	}
	        	while(l2!=null){
	        		if(head==null){
	        			head=l2;
	        			pListNode=l2;
	        		}else{
	        			pListNode.next=l2;
	        			pListNode=pListNode.next;	        			
	        		}
	        		l2=l2.next;
	        	}
	        	return head;
    }
}
