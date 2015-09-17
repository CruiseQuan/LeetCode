public int  myAtoi(String str) {
      str = str.trim();
	     if(str.length()==0)
	         return 0;
	     boolean flag=false;
	     long result=0;
	     int i=0;
	     if(str.charAt(0)=='-'){
	       flag=true;
	       i++;
	      }else if(str.charAt(0)=='+'){
	       i++;
	     } 
		while (i<str.length()  && Character.isDigit(str.charAt(i)) ) {
			result = result * 10 + (str.charAt(i) - '0');
			if(flag){
				if(result-1>=Integer.MAX_VALUE)
					return Integer.MIN_VALUE;
			}else{
				if(result>=Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
			}
			i++;
		}
		return flag?(int)-result:(int)result;
    }
