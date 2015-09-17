/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> descOrder =  new Comparator<ListNode>(){  
          
			public int compare(ListNode l1, ListNode l2) {
				// TODO Auto-generated method stub
				return l1.val-l2.val;			    
			}
             
        };   
    	PriorityQueue<ListNode>pq=new PriorityQueue<ListNode>(descOrder);
    	for(int i=0;i<lists.length;i++){
    		ListNode p=lists[i];
    		if(p!=null){
    			pq.offer(p);
    		}
    	}
    	ListNode head=null;
    	ListNode p=null;
    	while(!pq.isEmpty()){
    		ListNode cur =pq.poll();//获取最小节点，此时弹出一整条链表
            if(head == null)//如果head还为空，将head指向第一个节点
            {
                head = cur;
                p = head;
            }
            else//否则，连接节点到链表上
            {
                p.next = cur;
                p = cur;
            }           
            if(cur.next!=null)//如果还有后续节点
                pq.offer(cur.next);//放入最小堆中继续排序
    	}
		return head;
    }
}
