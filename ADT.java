/**
Sydney Davidson
Project 1
CSI 213
*/

//this is an interface for the abstract data type
public interface ADT{

	/**
	Inserts item into list
	@param Object object being inserted
	*/

	abstract void insert(Object item);

	/**
	Removes the last item in the list
	@return the Object being removed
	*/

	abstract Object removeLast();

	/**
	Removes a random item from the list
	@return the random Object being removed
	*/

	abstract Object removeRandom();

	/**
	Gets item from list
	@param Object obbject that is retrieved
	@return the object that is retrieved
	*/

	abstract Object get(Object item);

	/**
	Gets item at an index in the list
	@param int the index
	@return the Object at that index
	*/

	abstract Object get(int index);

	/**
	Gets the size of the list
	@return the size of the list as an integer 
	*/

	abstract int size();

	/**
	Says whether or not the bag is full
	@return a truth value if the bag is full or not
	*/

	abstract boolean isFull();

	/**
	Says whether or not the bag is empty
	@return a truth value is the bag is empty or not
	*/

	abstract boolean isEmpty();

	/**
	Empties the bag
	*/

	abstract void makeEmpty(); 


}