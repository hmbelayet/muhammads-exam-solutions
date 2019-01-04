package datastructure;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.add("Al-jabor");  //head, first
		queue.add("Omor");
		queue.add("Usman");
		queue.add("Ali");
		queue.add("Bukhari");  //tail, last
		System.out.println("\nFirst element of the queue: " + queue.peek() + "\n"); //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		queue.remove();    //Retrieves and removes the head of this queue.
		System.out.println("After removing head (by remove method), first element of this queue is-: " + queue.peek());

		System.out.println("\nPrinting queue using for each loop: ");
		for (String st : queue) {
			System.out.print(st + " ");
		}
		queue.add("Fiad");
		queue.poll();    //Retrieves and removes the head of this queue, or returns null if this queue is empty.

		System.out.println("\n\nPrinting queue After adding and removing one element using Iterator- ");
		Iterator it = queue.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}