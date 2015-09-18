public class Solution {
     public boolean isValidSudoku(char[][] board) {
	    	ArrayList<HashSet<Character>>boxList=new ArrayList<HashSet<Character>>();
	    	for(int i=0;i<9;i++)
		         boxList.add(new HashSet<Character>());
	        for(int i=0;i<9;i++){
	            Set<Character>rowSet=new HashSet<Character>();
	            Set<Character>colSet=new HashSet<Character>();
	            for(int j=0;j<9;j++){
	            	if(board[i][j]!='.'){
	            		if(rowSet.contains(board[i][j]))
	            			return false;
	            		rowSet.add(board[i][j]); 
	            		int k=(i/3)*3+j/3;
		            	if(boxList.get(k).contains(board[i][j]))
		            		return false;
		            	boxList.get(k).add(board[i][j]);
	            	}
	            	if(board[j][i]!='.'){
	            		if(colSet.contains(board[j][i]))
	            			return false;
	            		colSet.add(board[j][i]);            			
	            	}
	            	
	            }
	        }
	        return true;
	    }
}
