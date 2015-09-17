public class Solution {
//我写了两种算法，第一种比较常规，第二种利用字符串逻辑更简单
    public int reverse(int x) {
          long y=0;
	        while(x!=0){
             y=y*10+x%10;			
	         x=x/10;
	        }
	        if(y>Integer.MAX_VALUE||(-y)>Integer.MAX_VALUE){
	        	y=0;	        
	        }
	        int z=(int)y;
	        return z;
    }
    
    public int reverse2(int x) {
        boolean flag=false;
        StringBuffer sBuffer=new StringBuffer(x+"");
        if(x<0){
          flag=true;
          sBuffer.deleteCharAt(0);
        }       	
        int i;
        for(i=sBuffer.length()-1;i>0;i--)
        	if(sBuffer.charAt(i)!='0')
        		break;
        	else
        		sBuffer.deleteCharAt(i);
        long y=Long.valueOf(sBuffer.reverse().toString());
        if(flag){
        	if(y-1>Integer.MAX_VALUE)
        		return 0;
        	else
        		return (int) -y;    		
        }else{
        	if(y>Integer.MAX_VALUE)
        		return 0;
        	else
        		return (int) y;
        }
        
    }
}
