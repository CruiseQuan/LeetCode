public class Solution {
     public void nextPermutation(int[] num) {
	        int size=num.length,i,j=size-1;
	    	if(size<=1)
	    		return;
	    	 for(i=size-2;i>=0;i--)  
	    		 //从后向前找出位置i使得num[i]<num[i+1],此时num[i+1...]是非升序排列
	             if(num[i] < num[i+1])  
	                  break;
	    	 //
	    	 if(i>=0){
	    		 //从后向前找j使得num[j]>num[i]
	    		 while(num[i]>=num[j])
	    			  j--;
	    		 //因为num[j+1...]都小于num[i]，num[j]>num[i],而num[i+1..j-1]都大于num[j]
	    		 //因此也会大于num[i],所以用num[i]替换num[j]，子序列num[i+1...]仍然非升序排列
	    		 swap(num, i, j);
	    	 }
	    	 //子序列num[i+1...]是非升序排列，翻转后就成了非降序排列，就求出了答案
	    	 int begin=i+1,end=size-1;
	         while(begin<end){
	             swap(num, begin, end);
	             begin++;
	             end--;
	         }
	    }
	    public  void swap(int []array,int i,int j) {
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			
		}
}
