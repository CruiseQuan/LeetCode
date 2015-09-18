public class Solution {
    public int searchInsert(int[] A, int target) {
         int begin=0,end=A.length-1;
		 while(begin<=end){
			 int middle=(begin+end)/2;
			 if(target==A[middle])
				 return middle;
			 else if(target<A[middle])
				 end=middle-1;
			 else 
				begin=middle+1;		 
		 }
		 return begin;	 
	 }
}
