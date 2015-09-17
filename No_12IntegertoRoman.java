public class Solution {
    public String intToRoman(int num) {
        String result="";
		 String string=""+num;
		 for(int i=0;i<string.length();i++){
			 int digit=Integer.parseInt(string.charAt(i)+"");
			 result+=intToRomHelp(digit, string.length()-i-1);
		 }
		 return result;  
	 }
	 public String intToRomHelp(int digit,int number){//这个位置上的数字，和以这个数字为首的整数的位数
		 if(digit==0)
			 return "";
		 String[][]Roman={{"I","V"},{"X","L"},{"C","D"},{"M"}};//I(1)，V(5)，X(10)，L(50)，C(100)，D(500)，M(1000)
		 String result="";
		 if(digit==9){//digit为9
		  result=Roman[number][0]+Roman[number+1][0];
		 }else if(digit>=5){//5-8
			result=Roman[number][1];
			digit-=5;
			for(int i=0;i<digit;i++)
				result+=Roman[number][0];
			
		 }else if(digit==4){//4
			 result=Roman[number][0]+Roman[number][1];	 
		 }else{//1-3
			 for(int i=0;i<digit;i++)
				result+=Roman[number][0];			 	 
		}	 
		return result;

	 }
}
