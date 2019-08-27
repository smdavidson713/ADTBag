/**
Sydney Davidson
Project 1
CSI 213
*/

/** this is the Bag class that contains
all the methods to manipulate the bag */
import java.util.Random;
import java.lang.String;

public class Bag implements ADT{

	Object items[];
	int counter;

	Bag(){
		counter = 0; 
		items = new Object[100];

	}

	/**
	Inserts item into list
	@param Object object being inserted
	*/

	public void insert(Object item){
		try{
			if(counter < items.length){
				items[counter] = item;
				counter++;
				return;
			}
			Object newItems[] = new Object[items.length+1];

			for(int i = 0; i < items.length; i++){
				newItems[i] = items[i];
			}
			items = newItems;
			items[counter] = item;
			counter++;
			newItems = null;
		}
		catch(Exception e){
			System.out.println("Item given is not of type Object");
		}
	}

	/**
	Removes the last item in the list
	@return the Object being removed
	*/

	public Object removeLast(){
		Object item;
		item = items[counter-1];
		items[counter-1] = null;
		counter--;
		return item; 
	}

	/**
	Removes a random item from the list
	@return the random Object being removed
	*/

	public Object removeRandom(){
		if (counter == 0){
			System.out.print("The bag is empty");
			return null;
		}
		Object item;

		Random random = new Random();
		int x = random.nextInt(counter);

		item = items[x];
		items[x] = null;
		counter--;
		for(int i = x; i < items.length; i++){
			if(i+1 != items.length)
				items[i] = items[i+1];
			else
				items[i] = null;
		}
		return item;
	}

	/**
	Gets item from list
	@param Object obbject that is retrieved
	@return the object that is retrieved
	*/

	public Object get(Object item){
		for(int i = 0; i < items.length; i++){
			try{
				String x = String.valueOf(item);
				String y = String.valueOf(items[i]);
				if(y.compareTo(x) == 0)
					return item;
			}
			catch(Exception e){
				if(items[i] == item)
					return item;

			}
		}	
		return null;
	}

	/**
	Gets item at an index in the list
	@param int the index
	@return the Object at that index
	*/

	public Object get(int index){
		try{
			if(index < counter)
				return items[index];
			else
				return null;
		}
		catch(Exception e){
			System.out.println("Proper index wasn't given");
			return null;
		}
	}

	/**
	Gets the size of the list
	@return the size of the list as an integer 
	*/

	public int size(){
		return counter;
	}

	/**
	Says whether or not the bag is full
	@return a truth value if the bag is full or not
	*/

	public boolean isFull(){
		if(counter == items.length)
			return true;
		else
			return false;
	}

	/**
	Says whether or not the bag is empty
	@return a truth value is the bag is empty or not
	*/

	public boolean isEmpty(){
		if(counter == 0)
			return true;
		else
			return false;
	}

	/**
	Empties the bag
	*/

	public void makeEmpty(){
		for(int i = 0; i < items.length; i++){
			items[i] = null;
		}
		counter = 0; 
	}

	public void print(){
		for(int i = 0; i < items.length; i++)
			if(items[i] != null)
				System.out.println(items[i]);
	}
}