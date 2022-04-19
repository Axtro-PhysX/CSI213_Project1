package proj1csi213;

/*
 * Interface where methods are set
 * and that are used in the Bag class.
 */

public interface theInterface {
	
	public void insert(Object item);
	
	public void removeLast();
	
	public void removeRandom();
	
	public Object get(int index);
	
	public int getIndex(Object item);
	
	public int size();
	
	public boolean isEmpty();
	
	public void makeEmpty();

}
