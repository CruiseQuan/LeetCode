public class Solution {
    public int divide(int dividend, int divisor) {
       long result=0,tempDividend = dividend,tempDivisor = divisor; 
		 boolean flag=true;
		 if(dividend<0){
			 tempDividend=-tempDividend;
			 flag=!flag;
		 }
		 if(divisor<0){
			 tempDivisor=-tempDivisor;
			 flag=!flag;
		 }
	     while(tempDividend>=tempDivisor){
	          long binaryDivisor=tempDivisor,count=1;
              while(tempDividend>=(binaryDivisor<<1)){
                   binaryDivisor<<=1;
                   count<<=1;
               }
               tempDividend-=binaryDivisor;
               result+=count;
	        }        
	         if(!flag)
	             result=-result;
	         if(result>Integer.MAX_VALUE)
	           	 return Integer.MAX_VALUE;
	         return (int)result;
    }
}
