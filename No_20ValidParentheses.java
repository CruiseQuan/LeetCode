public class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<Character>();
		 char c;
		 for(int i=0;i<s.length();i++)
		 {
			 c=s.charAt(i);
			 if(c=='('){
				 stack.push(c);
			 }else if(c==')'){
				 if(stack.empty()){
					 return false;
				 }
				 if(stack.peek()=='('){
					 stack.pop();
				 }else{
					 return false;
				 }
			 }else if(c=='{'){
				 stack.push(c);
			 }else if(c=='}'){
				 if(stack.empty()){
					 return false;
				 }
				 if(stack.peek()=='{'){
					 stack.pop();
				 }else{
					 return false;
				 }
			 }else if(c=='['){
				 stack.push(c);
			 }else if(c==']'){
				 if(stack.empty()){
					 return false;
				 }
				 if(stack.peek()=='['){
					 stack.pop();
				 }else{
					 return false;
				 }
			 }
		 }
		 if(stack.empty())
			 return true;
		 return false;
    }
}
