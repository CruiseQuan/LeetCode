// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {

	Iterator<Integer>pi=null;
	Integer integer=null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initiaiize any member here.
	    pi=iterator;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(integer==null&&pi.hasNext())
        	integer=pi.next();
        return integer;
	}


	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(integer!=null)
			return true;
		return pi.hasNext();
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		 if(integer!=null){
			 Integer temp=integer;
			 integer=null;
			 return temp;
		 }
		return pi.next();
		
	}
}
