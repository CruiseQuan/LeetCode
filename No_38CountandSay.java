public class Solution {
    public String countAndSay(int n) {
            String s="1";
	        for(int k=1;k<n;k++){
	           String temp="";
	           int count=0;
	           char j='0';
	           for(int i=0;i<s.length();i++){
	             if(i!=0&&s.charAt(i)==s.charAt(i-1))
	                    count++;
	             else if(i==0)
	                   count++;
	             else{
	                  j= s.charAt(i-1);
	                  temp=temp+count+ j; 
	                  count=1;
	              }
	           }
	           if(count>0){
	             j= s.charAt(s.length()-1);
	             temp=temp+count+j; 
	            }
	            s=temp;
	        }
	         return s;
    }
}
