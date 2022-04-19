package proj1;
import java.io.*;
import java.util.Scanner;

public class Helper {
	
	/**
	 * Start the process of filling the bag and
	 * display what is in it and while testing methods.
	 * 
	 * @throws FileNotFoundException if file cannot be found.
	 */
	
	public static void start() throws FileNotFoundException {
		
		Bag theBag = new Bag(); //Items in Bag
		create(theBag); // calls fillBag method
		display(theBag);
		
		// Method testing process
		
		theBag.removeLast(); //removes last item from the bag
		display(theBag); //display contents of bag
		
		theBag.removeRandom(); //method removes a random item from the bag
		display(theBag); //display contents of bag
		
		System.out.println(theBag.get(6)); //Display the item(s) at index number 6
		System.out.println(theBag.getIndex("Rice")); //Display index of "Rice"
		
		System.out.println(theBag.size()); // Display amount of items in the bag.
		System.out.println(theBag.isEmpty()); //Display if the bag is empty or not.
		
		theBag.makeEmpty(); //Call makeEmpty method to clear bag.
		
		System.out.println(theBag.isEmpty()); // Display if bag is empty.
		
		
	}
	
	/**
	 * Read each line of the .txt file and store
	 * the contents with the insert method.
	 * 
	 * @param theBag parameter theBag to the start of the method.
	 * @throws FileNotFoundException if file is not found
	 */
	
	public static void create(Bag theBag) throws FileNotFoundException {
		Scanner scanner = new Scanner (new File("list.txt")); //Create new scanner and select "list.txt"
		
		while (scanner.hasNext()) // Loop continues while scanner has nextLine.
		
		{
			
			theBag.insert(scanner.nextLine());
			
		}
		
		scanner.close();
	}
	
	/**
	 * Method to display the items currently in the bag and
	 * show position of the item in the bag.
	 * 
	 * @param bagCount to start of method
	 */
	
	public static void display(Bag bagCount) {
		
		int Count = 0; // Set count to "0"
		System.out.println("Contents of the bag: ");
		
		for (int i = 0; i < bagCount.size(); i++) //Display index and add loop to index/
		{ 
			Count++; // Count items at position.
			Object display = bagCount.get(i); // Get item index.
			System.out.println(Count + ". " + display); // Display item and its position.
		
		}
		
		System.out.println();
	}

}
