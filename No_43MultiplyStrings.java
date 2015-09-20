public class Solution {
    public String multiply(String num1, String num2) {
	    int n=num1.length(),m=num2.length();
		    int []nums=new int [n+m];
		    //从低位开始处理
		    for(int i=n-1;i>=0;i--)
		    	for(int j=m-1;j>=0;j--){
		    		nums[i+j+1]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
		    		nums[i+j]+=nums[i+j+1]/10;
		    		nums[i+j+1]%=10;
		    	}
		    
		    String ret="";
		    for(int i=0;i<n+m-1;i++){
		    	if(ret.length()==0&&nums[i]==0)
		    		continue;//0不能做整数的开头除了0本身
		    	ret+=nums[i];
		    }
		    ret+=nums[n+m-1];
		    return ret;
    }
}
