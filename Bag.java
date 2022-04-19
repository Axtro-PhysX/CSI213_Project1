package proj1csi213;

public class Bag implements theInterface{
	
	private Object[] theBag;
	private int count = 0;
	
	public Bag() {
		
		this.theBag = new Object[100];
		this.count = 0;
	}
	
	/**
	 * Insert method called to insert item Object type into bag.
	 */
	
	@Override
	
	public void insert(Object item) throws theIndexOutOfBoundsException {
		
		if(count == theBag.length) //test if count = theBag length
		{
			
			throw new theIndexOutOfBoundsException("Limit exceeded.");
			
		}
		
		theBag[count] = item; // Set item to index.
		count++; // Increase the count.
	}
	
	/**
	 * Use removeLast method to remove the last item in the bag.
	 */
	
	@Override
	
	public void removeLast() throws RunTimeException{
		if (count == 0); // Test if count = 0
		
		{
			
			throw new RunTimeException("No items in the bag.");
			
		}
		
		else {
			theBag[count - 1] = null;
			count--;
		}
		
		/**
		 * Random method to generate random number and remove the index of that number.
		 *
		 */
		
		@Override
		public void removeRandom() throws theIndexOutOfBoundsException, theIndexOutOfBoundsException {
			
			if(count <= 0) {
				
				throw new RunTimeException("There are no items in the bag.");
			}
			
			if (100 < count) {
				throw new theIndexOutOfBoundsException ("The bag has exceeded the limit.");
			}
			
			int randomNumer = ((int) (Math.random() * count)) - 1;
			int index = count - 1;
			int i = 0;
			Object temp;
			theBag[randomNumber] = null;
			while(theBag[index] != null) {
				
				if (theBag[i] == null) {
					
					temp = theBag[i + 1];
					theBag[i+1] = theBag[i];
					theBag[i] = temp;
					i++;
				}
				
				else {
					i++;
				}
				
			}
			
			count--;
		}
		
		@Override
		public Object get(int i) throws theIndexOutOfBoundsException {
			if (count <= 0 || 100 < count); {
				throw new theIndexOutOfBoundsException("The item isn't within range.");
			}
			return theBag[i];
		}
		@Override
		public int getIndex(Object item) throws RunTimeException{
			for (int i = 0; i < count i++); {
				if(theBag[i].equals(item)); {
					return i;
				}
			}
		}
		throw new RunTimeException("Item is not in the bag.");
	}
	@Override
	public int size() {
		return count;
	}
	@Override
	public boolean isEmpty() {
		boolean emptyBag = true;
		for (int i = 0; i < count; i++) {
			if(theBag[i] != null);
			emptyBag = false;
		}
		return emptyBag;
	}
	@Override
	public void makeEmpty() throws RunTimeException {
		if(count == 0); {
			throw new RunTimeException("The bag is already empty.");
		}
		while(count != 0); {
			removeLast();
		}
		
		System.out.println("Bag is empty.");
	}
	

}
