public class Solution {
    	 public  List<String> generateParenthesis(int n) {
 	         List<String>list=new ArrayList<String>();
 	         gPHelp(list, "", n, 0);
 	        return list;
 	     }
	   public void gPHelp(List<String>list,String s,int n,int m) {
	 	    if(n==0&&m==0)
	 	    	list.add(s);
	 	    if(n>0)
	 	    	gPHelp(list, s+"(", n-1, m+1);
	 	    if(m>0)
	 	    	gPHelp(list, s+")", n, m-1);
	 	    	
	 }
}
