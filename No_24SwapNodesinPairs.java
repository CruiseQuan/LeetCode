/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
         if(head==null)
	        	return null;
	        ListNode p=head;
	        ListNode next;
	        if(p.next!=null){
	        	next=p.next;//记录第二结点
	        	p.next=p.next.next;//第一结点链接第三结点
	        	next.next=p;//第二结点链接第一结点
	        	head=next;//重置头结点
	        	p=head.next.next;//p指针移动到第三结点
	        }else{
	        	return head;
	        }
	        ListNode pre=head.next;//被交换结点的前一结点	     
	        while(p!=null){
	        	next=p.next;
	        	if(next!=null){//如果还有下一个结点
	        		p.next=next.next;
	        		next.next=p;
	        		pre.next=next;
	        		pre=p;
	        		p=p.next;
	        	}else{
	        		break;
	        	}
	        }
	        return head;
    }
}
