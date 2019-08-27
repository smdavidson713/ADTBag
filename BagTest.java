/**
Sydney Davidson
Project 1
CSI 213
*/
import java.io.*;

// This tests the Bag class
public class BagTest{
	public static void start() throws IOException{
		Bag bag = new Bag();
		FileReader fr = new FileReader("list.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;

		while((line = br.readLine()) != null){
			bag.insert(line);
		}

		System.out.println("Here's your list: ");
		bag.print();

		System.out.println("-------------------");
		System.out.println("Is the bag full?");
		System.out.println(bag.isFull());

		bag.removeLast();
		System.out.println("-------------------");
		System.out.println("Let's remove the last item in the list: ");
		bag.print();

		bag.removeRandom();
		System.out.println("-------------------");
		System.out.println("Let's remove a random item in the list: ");
		bag.print();

		System.out.println("-------------------");
		System.out.println("Let's get a random item in the list: ");
		System.out.println(bag.get("Coffee"));

		
		System.out.println("-------------------");
		System.out.println("Let's get an item from some index in the list: ");
		System.out.println(bag.get(2));

		System.out.println("-------------------");
		System.out.println("Is the bag full?");
		System.out.println(bag.isFull());

		System.out.println("-------------------");
		System.out.println("Here's the size of the list: ");
		System.out.println(bag.size() + " items");

		System.out.println("-------------------");
		System.out.println("Now let's empty the bag.");
		bag.makeEmpty();
		bag.print();

		System.out.println("-------------------");
		System.out.println("Is the bag empty?");
		System.out.println(bag.isEmpty());


	}
}